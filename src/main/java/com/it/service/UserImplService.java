package com.it.service;

import com.it.util.CommonResult;



public interface UserImplService {

    CommonResult queryUserList();

    CommonResult addUser();

    CommonResult updateUser();

    CommonResult deleteUser();
}
