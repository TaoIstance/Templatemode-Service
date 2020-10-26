package com.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-26 18:39
 * @description 基础PO
 **/
@Data
public abstract class AbstractPO {
    @TableId
    private String id;
    private Integer isDelete;
    private String updateBy;
    private String createBy;
    private LocalDateTime updateDateTime;
    private LocalDateTime createDateTime;
}
