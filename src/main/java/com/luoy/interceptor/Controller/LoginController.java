package com.luoy.interceptor.Controller;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public void login(@RequestParam("userName")String userName,@RequestParam("password")String password) {
        System.out.println(userName+password);
    }


}
