package com.yf.garden.common.session;

import com.yf.garden.common.vo.LoginInfoVo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 用户会话信息
 * @author 张继生
 */
@Component@Getter@Setter
public class UserSession implements Serializable {
    private static final long serialVersionUID = -1564710705605822550L;
    //登录用户信息
    private LoginInfoVo user;
}
