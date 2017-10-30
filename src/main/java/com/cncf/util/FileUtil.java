package com.cncf.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
/**
 * Created by zs on 2017/10/18.
 */
public class FileUtil {
    /**
     * 递归查找文件
     * @param baseDirName  查找的文件夹路径
     * @param targetFileName  需要查找的文件名
     * @param fileList  查找到的文件集合
     */
    public static void findFiles(String baseDirName, String targetFileName, List fileList) {

        File baseDir = new File(baseDirName);       // 创建一个File对象
        if (!baseDir.exists() || !baseDir.isDirectory()) {  // 判断目录是否存在
            System.out.println("文件查找失败：" + baseDirName + "不是一个目录！");
        }
        String tempName = null;
        //判断目录是否存在
        File tempFile;
        File[] files = baseDir.listFiles();
        for (int i = 0; i < files.length; i++) {
            tempFile = files[i];
            if(tempFile.isDirectory()){
                findFiles(tempFile.getAbsolutePath(), targetFileName, fileList);
            }else if(tempFile.isFile()){
                tempName = tempFile.getName();
                if(wildcardMatch(targetFileName, tempName)){
                    // 匹配成功，将文件名添加到结果集
                    fileList.add(tempFile.getAbsoluteFile());
                }
            }
        }
    }

    /**
     * 通配符匹配
     * @param pattern    通配符模式
     * @param str    待匹配的字符串
     * @return    匹配成功则返回true，否则返回false
     */
    private static boolean wildcardMatch(String pattern, String str) {
        int patternLength = pattern.length();
        int strLength = str.length();
        int strIndex = 0;
        char ch;
        for (int patternIndex = 0; patternIndex < patternLength; patternIndex++) {
            ch = pattern.charAt(patternIndex);
            if (ch == '*') {
                //通配符星号*表示可以匹配任意多个字符
                while (strIndex < strLength) {
                    if (wildcardMatch(pattern.substring(patternIndex + 1),
                            str.substring(strIndex))) {
                        return true;
                    }
                    strIndex++;
                }
            } else if (ch == '?') {
                //通配符问号?表示匹配任意一个字符
                strIndex++;
                if (strIndex > strLength) {
                    //表示str中已经没有字符匹配?了。
                    return false;
                }
            } else {
                if ((strIndex >= strLength) || (ch != str.charAt(strIndex))) {
                    return false;
                }
                strIndex++;
            }
        }
        return (strIndex == strLength);
    }
    //删除文件以及文件夹
    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            File[] ff = file.listFiles();
            for (int i = 0; i < ff.length; i++) {
                deleteFile(ff[i].getPath());
            }
        }
        file.delete();
    }
//---------------------------------------以下是ZJ添加的方法----------------------------------------

    public File getFileByName(String fileName){
        String classPath=getClassPath();
        File file=new File(classPath+"\\"+fileName);
        return file;
    }

    public String getClassPath(){
        URL url = getClass().getResource("/");
        File directory = null;
        try {
            directory = new File(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String classPath=directory.getAbsolutePath();
        return classPath;
    }

    public void cleanup(BufferedReader br, BufferedWriter bw, File tempFile){
        try {
            br.close();//提前退出如果不关闭流则会导致后面进来的线程无法删除文件
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean deleteResult = tempFile.delete();
        System.out.println("临时文件删除结果： " + deleteResult);
    }

}