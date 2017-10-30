package com.cncf.service.impl;

import com.cncf.dao.ArticleDao;
import com.cncf.entity.Article;
import com.cncf.service.ArticleService;
import com.cncf.util.FileUtil;
import com.cncf.util.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.List;
/**
 * @author zj
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public boolean deleteById(int id) {
        return articleDao.deleteById(id);
    }

    public boolean insertArticle(Article article) {
        return articleDao.insertArticle(article);
    }

    public String selectTitleById(int id) {
        return articleDao.selectTitleById(id);
    }

    public List selectArticleByCategoryAndPage(Integer categoryId, int page, int pageSize) {
        int offset = page*pageSize;
        int limit = pageSize;
        return articleDao.selectArticleByCategoryAndPage(categoryId,offset,limit);
    }

    public boolean updateTitleById(int id, String title) {
        return articleDao.updateTitleById(id,title);
    }

    public boolean updateContentById(int id, String content) {
        return articleDao.updateContentById(id,content);
    }

    public boolean updateArticle(Article article) {
        return articleDao.updateArticle(article);
    }

    public synchronized void download(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException, InterruptedException {
        String fileName = "**********";
        //String fileName = "天龙八部28.rmvb";
        File file = new FileUtil().getFileByName(fileName);

        InputStream in = new FileInputStream(file);
        OutputStream os = response.getOutputStream();

        //清空response 缓存中数据，仅保留状态码及Header
        response.reset();
        byte[] buffer = new byte[128];
        long downloaded = 0;

        String range = request.getHeader("range");
        if (range != null) {
            System.err.println("ServiceImpl打印看看request对象中的range："+range);
            //格式为：range：bytes=40724-361229960
            downloaded = Long.parseLong(range.split("-")[0].split("=")[1]);
            response.setStatus(206); //设置 206状态表示可以断点下载
            //设置下载的范围
            response.setHeader("Content-Range", "bytes " + downloaded + "-" + file.length() + "/" + file.length());
        }
        response.setContentType("application/octet-stream");

        HttpUtils httpUtils=new HttpUtils();
        //判断浏览器类型解决下载文件名乱码问题
        boolean isMSIE = httpUtils.isMSBrowser(request);
        if (isMSIE) {
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } else {
            fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
        }
        response.setHeader("Content-disposition", "attachment;filename=\"" + fileName + "\"");
        response.addHeader("Content-Length", file.length() + ""); //文件大小
        response.setHeader("Accept-Ranges", "bytes"); //接受范围 bytes

        httpUtils.iteratorRequest(request);
        httpUtils.iteratorResponse(response);

        int len = 0;
        in.skip(downloaded);
        while ((len = in.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            Thread.sleep(10);
        }
        in.close();
        os.flush();
        os.close();
    }
}
