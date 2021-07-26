package io.midsphere.code.service.impl;

import io.midsphere.code.CodeProcessor;
import io.midsphere.code.model.CodeBranch;
import io.midsphere.code.service.CodeService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 代码业务处理类
 * @author liqiwen
 * @since 1.0
 */
@Service
public class CodeServiceImpl implements CodeService {


    private final List<CodeProcessor> codeProcessors;


    public CodeServiceImpl(ObjectProvider<CodeProcessor> codeProcessorObjectProvider) {
        this.codeProcessors = codeProcessorObjectProvider.stream().collect(Collectors.toList());

    }


    @Override
    public List<CodeBranch> findAllBranches() {

        return null;
    }


    @Override
    public void cloneCode() {




    }


}
