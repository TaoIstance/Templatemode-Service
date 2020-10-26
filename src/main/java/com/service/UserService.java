package com.service;

import com.mapper.UserMapper;
import com.param.AbstractParam;
import com.param.user.UserParam;
import com.po.UserPO;
import com.vo.AbstractResponse;
import com.vo.user.UserResponse;
import org.springframework.stereotype.Service;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-23 10:36
 * @description 用户业务类
 **/
@Service
public class UserService extends AbstractService<UserResponse, UserParam, UserMapper,UserPO>{

    @Override
    UserResponse getResponse() {
        return new UserResponse();
    }

    @Override
    public Integer delete() {
        return 1;
    }

    @Override
    public Integer modify() {
        return 2;
    }

    @Override
    public Integer save() {
        return 3;
    }
}
