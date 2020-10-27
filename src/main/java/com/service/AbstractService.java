package com.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.param.AbstractParam;
import com.po.AbstractPO;
import com.vo.AbstractResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-23 10:27
 * @description 抽象业务类
 **/
public abstract class AbstractService<R extends AbstractResponse, P extends AbstractParam,M extends BaseMapper<E>,E> extends ServiceImpl<M,E>{

    abstract R getResponse();


    public R searchById(String id) {
        R response=getResponse();
        E e = this.getBaseMapper().selectById(id);
        BeanUtils.copyProperties(e,response);
        return response;
    }

    public R searchParam(P p){
        R response=getResponse();
        E e = this.getBaseMapper().selectById(p.getId());
        BeanUtils.copyProperties(e,response);
        return response;
    }

    public String search() {
        return "1";
    }

    public Integer delete() {
        return 2;
    }

    public Integer modify() {
        return 3;
    }

    public Integer save() {
        return 4;
    }
}
