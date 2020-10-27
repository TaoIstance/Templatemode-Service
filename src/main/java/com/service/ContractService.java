package com.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mapper.ContractMapper;
import com.param.contract.ContractParam;
import com.po.ContractPO;
import com.vo.contract.ContractResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<ContractResponse> searchPageList(ContractParam param) {
        Page<ContractPO> contractPOPage=PageHelper.startPage(param.getPageNum(), param.getPageSize()).doSelectPage(() -> this.getBaseMapper().selectList(new LambdaQueryWrapper<>()));
        List<ContractPO> contractPOList = contractPOPage.getResult();
        List<ContractResponse> result =new ArrayList<>(contractPOList.size());
        contractPOList.forEach(contractPO -> {
            ContractResponse contractResponse=new ContractResponse();
            BeanUtils.copyProperties(contractPO,contractResponse);
            result.add(contractResponse);
        });
        return result;
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
