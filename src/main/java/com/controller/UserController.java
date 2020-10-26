package com.controller;

import com.mapper.UserMapper;
import com.param.user.UserParam;
import com.po.UserPO;
import com.service.UserService;
import com.vo.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-23 10:35
 * @description 用户接口控制类
 **/
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<UserService, UserResponse, UserParam,UserMapper,UserPO>{
}
