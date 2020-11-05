package com.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.param.AbstractParam;
import com.vo.AbstractResponse;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

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

    public List<R> searchPage(P p){
        Page<E> page=PageHelper.startPage(p.getPageNum(), p.getPageSize());
        Page<E> mapperList = page.doSelectPage(() -> this.getBaseMapper().selectList(new LambdaQueryWrapper<>()));
        List<R> result =new ArrayList<>(mapperList.size());
        mapperList.forEach(contractPO -> {
            R r=getResponse();
            BeanUtils.copyProperties(contractPO,r);
            result.add(r);
        });
        return result;
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
