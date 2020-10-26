package com.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-26 17:03
 * @description 用户数据实体
 **/
@Data
@TableName(value = "t_user")
public class UserPO extends AbstractPO{
   private String code;
   private String name;
   private String age;
   private String mobileNumber;
}
