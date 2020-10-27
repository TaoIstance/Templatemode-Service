package com.param;

import com.github.pagehelper.Page;
import lombok.Data;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-26 14:31
 * @description 基础参数类
 **/
@Data
public abstract class PageParam {
    private Integer pageSize;
    private Integer pageNum;
    private Long total;
    private String orderBy;
}
