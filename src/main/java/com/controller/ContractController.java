package com.controller;

import com.mapper.ContractMapper;
import com.param.contract.ContractParam;
import com.po.ContractPO;
import com.service.ContractService;
import com.service.UserService;
import com.vo.contract.ContractResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
