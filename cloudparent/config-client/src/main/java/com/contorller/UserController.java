package com.contorller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${user.userName}")
    private String userName;

    @Value("${user.sex}")
    private String sex;
    @Value("${user.age}")
    private Integer age;

    @RequestMapping(value = "/user")
    public String getUserInfo(){
        return "userName:"+userName+" sex:"+sex+" age:"+age;
    }
}