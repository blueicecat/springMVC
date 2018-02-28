package com.linying.controller;

import com.linying.common.ResultInfo;
import com.linying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by linying on 2017/3/27
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public ResultInfo getUser() {
        return ResultInfo.success("success", userService.findAll());
    }
}
