package io.midsphere.code.service;

import io.midsphere.code.model.CodeBranch;

import java.util.List;

/**
 * 代码 Service
 * @author liqiwen
 * @since 1.0
 */
public interface CodeService {

    void cloneCode();


    List<CodeBranch> findAllBranches();

}
