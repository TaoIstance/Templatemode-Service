package com.vo.user;

import com.vo.AbstractResponse;
import lombok.Data;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-26 14:37
 * @description 用户响应vo
 **/
@Data
public class UserResponse extends AbstractResponse {
    private String code;
    private String age;
    private String mobileNumber;
}
