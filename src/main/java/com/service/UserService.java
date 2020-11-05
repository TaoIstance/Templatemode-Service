package com.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mapper.UserMapper;
import com.param.user.DivideParam;
import com.param.user.UserParam;
import com.po.UserPO;
import com.vo.user.UserResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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



    public List<UserResponse> searchDivideTable(DivideParam divideParam){
        List<UserPO> userPOS = this.getBaseMapper().selectList(new LambdaQueryWrapper<UserPO>().eq(UserPO::getMobileNumber, divideParam.getMobileNumber()).eq(UserPO::getName,divideParam.getName()));
       List<UserResponse> userResponseList=userPOS.stream().map(userPO -> {
            UserResponse userResponse = new UserResponse();
            BeanUtils.copyProperties(userPO,userResponse);
            return userResponse;
        }).collect(Collectors.toList());
        return userResponseList;
    }

}
