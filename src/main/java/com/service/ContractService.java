package com.service;

import com.mapper.ContractMapper;
import com.param.contract.ContractParam;
import com.po.ContractPO;
import com.vo.contract.ContractResponse;
import org.springframework.stereotype.Service;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-23 10:36
 * @description 合同业务类
 **/
@Service
public class ContractService extends AbstractService<ContractResponse, ContractParam, ContractMapper, ContractPO>{


    @Override
    ContractResponse getResponse() {
        return new ContractResponse();
    }

    @Override
    public Integer delete() {
        return 11;
    }

    @Override
    public Integer modify() {
        return 22;
    }

    @Override
    public Integer save() {
        return 33;
    }
}
