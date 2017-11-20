package com.cncf.vo;

import com.cncf.entity.UserBase;
import lombok.Data;

import java.util.List;

/**
 * Created by xmc1993 on 2017/10/14.
 */
@Data
public class LoginVo {
    private Integer id;
    private String accessToken;
    private List<Integer> codeIds;
    private UserBase userBase;
}
