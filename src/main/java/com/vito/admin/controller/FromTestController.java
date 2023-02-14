package com.vito.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * */
@Controller
public class FromTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(
            @RequestPart("headImg") MultipartFile file,   //上传文件
            @RequestPart("photos") MultipartFile[] files   //上传文件
            ){

        return "main";
    }

}
