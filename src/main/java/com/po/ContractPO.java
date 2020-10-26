package com.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-26 17:04
 * @description 合同数据实体
 **/
@Data
@TableName(value = "t_contract")
public class ContractPO extends AbstractPO{
    private String code;
    private String name;
}
