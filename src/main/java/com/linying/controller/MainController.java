package com.linying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {


    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }
}
