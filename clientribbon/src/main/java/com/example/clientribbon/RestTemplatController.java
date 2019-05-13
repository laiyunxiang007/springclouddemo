package com.example.clientribbon;

import com.example.clientribbon.Util.UserContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建者 bee
 * 类名称
 * 类说明
 * 创建时间 2019/5/7
 */
@RestController
public class RestTemplatController {
    @Autowired
    OrganzitionRestTemplateClient organzitionRestTemplateClient;


    @GetMapping("/restTemplate/{id}")
    public String test(@PathVariable String id){
        System.out.println("controller=="+UserContextHolder.getContext().getCorrelationId());
    return organzitionRestTemplateClient.getOrganzition(id);
    }
}
