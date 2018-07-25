package com.dream.sbm.usermanager.controller;

import com.dream.common.util.JsonResult;
import com.dream.sbm.usermanager.entity.User;
import com.dream.sbm.usermanager.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/loginView")
    public String loginView(){
        return "index";
    }

    @RequestMapping("/userLogin")
    @ResponseBody
    public JsonResult userLogin(User user){
        JsonResult JsonResult = new JsonResult();
        try{
            JsonResult.setResultData(userService.userLogin(user));
            JsonResult.setCode("200");
        }catch(Exception e){
            JsonResult.setCode("201");
            logger.error("获取用户信息失败!");
            e.printStackTrace();
        }
        return JsonResult;
    }
}
