package com.it.service.impl;

import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.it.service.UserImplService;
import com.it.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl   implements UserImplService {





    @Autowired
    private UserMapper userMapper;

    @Override
    public CommonResult queryUserList() {
        List<User> userList=userMapper.queryUserList();
        for (User user : userList
        ) {
            System.out.println(user);
        }
        return new CommonResult<>(200, "查看成功",userList);
    }

    @Override
    public CommonResult addUser() {
        userMapper.addUser(new User(5,"zz","zz"));
        return new CommonResult<>(200, "添加成功");
    }

    @Override
    public CommonResult updateUser() {
        userMapper.updateUser(new User(1,"gg","gg"));
        return new CommonResult<>(200, "成功");
    }

    @Override
    public CommonResult deleteUser() {
        userMapper.deleteUser(5);
        return new CommonResult<>(200, "成功");
    }
}
