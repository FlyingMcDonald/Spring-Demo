package com.ssm.controller;

import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispactherController {
    @Autowired
    UserService userService;
    @RequestMapping("/demo")
    public String index(){
        String str = userService.userQuery();
        System.out.println(str);
        return "demo";
    }
}
