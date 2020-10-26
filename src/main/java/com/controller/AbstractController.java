package com.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.param.AbstractParam;
import com.service.AbstractService;
import com.vo.AbstractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p>TemplatemodeController TODO</p>
 *
 * @author hetao
 * @date 2020/10/22 17:06
 **/
@ResponseBody
public  class   AbstractController<S extends AbstractService,R extends AbstractResponse,P extends AbstractParam,M extends BaseMapper<E>,E> {
    @Autowired
    S s;

    @GetMapping("/search")
    public String search(){
        return s.search();
    }

    @GetMapping("/search/{id}")
    public R searchById(@PathVariable(name = "id")String id){
        return (R) s.searchById(id);
    }

    @DeleteMapping("/search")
    public Integer delete(){
        return s.delete();
    }
    @PutMapping("/modify")
    public Integer modify(){
        return s.modify();
    }
    @PostMapping("/save")
    public Integer save(){
        return s.save();
    }
}
