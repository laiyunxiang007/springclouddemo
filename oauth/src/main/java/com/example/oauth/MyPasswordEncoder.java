package com.example.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/4/30
 */
@Configuration
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}
