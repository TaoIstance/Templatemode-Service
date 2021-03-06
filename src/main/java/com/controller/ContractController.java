package com.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.mapper.ContractMapper;
import com.param.contract.ContractParam;
import com.po.ContractPO;
import com.service.ContractService;
import com.service.UserService;
import com.vo.contract.ContractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-23 10:35
 * @description 合同接口控制类
 **/
@RestController
@RequestMapping("/contract")
public class ContractController extends AbstractController<ContractService, ContractResponse, ContractParam, ContractMapper, ContractPO>{

    @GetMapping("/searchPageList")
    public List<ContractResponse> searchPageList(@RequestBody ContractParam param){
        return  s.searchPageList(param);
    }
}
