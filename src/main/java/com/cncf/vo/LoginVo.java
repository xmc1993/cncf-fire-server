package com.cncf.vo;

import com.cncf.entity.UserBase;
import lombok.Data;

/**
 * Created by xmc1993 on 2017/10/14.
 */
@Data
public class LoginVo {
    private Integer id;
    private String accessToken;
    private UserBase userBase;
}
