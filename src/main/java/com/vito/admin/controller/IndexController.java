package com.vito.admin.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    /**
     *
     * 登录页面
     * */
    @GetMapping(value = {"/","/login"})
    public String index(){
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, String userName, String password){
        HttpSession session = request.getSession();
        session.setAttribute("loginUser",userName);
        return "main";
    }


}
