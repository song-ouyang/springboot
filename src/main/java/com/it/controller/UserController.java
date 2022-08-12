package com.it.controller;


import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.it.service.UserImplService;
import com.it.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserImplService userImplService;



    //查询所有用户
    @GetMapping("/queryUserList")
    public CommonResult queryUserList()
    {
        return userImplService.queryUserList();
    }


    //添加一个
    @GetMapping("/addUser")
    public CommonResult addUser()
    {
        return userImplService.addUser();
    }


    //修改
    @GetMapping("/updateUser")
    public  CommonResult updateUser()
    {
        return userImplService.updateUser();
    }


    //添加一个
    @GetMapping("/deleteUser")
    public CommonResult deleteUser()
    {
        return userImplService.deleteUser();
    }






}
