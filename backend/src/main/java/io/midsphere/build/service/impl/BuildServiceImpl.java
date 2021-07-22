package io.midsphere.build.service.impl;

import io.midsphere.build.model.BuildHistory;
import io.midsphere.build.model.BuildPipeline;
import io.midsphere.build.model.vo.BuildHistoryQueryRequest;
import io.midsphere.build.service.BuildService;
import io.midsphere.dto.PageDTO;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 构建业务实现类
 * @author liqiwen
 * @since 1.0
 */
@Service
public class BuildServiceImpl implements BuildService {



    @Override
    public PageDTO<BuildHistory> findBuildHistories(BuildHistoryQueryRequest queryRequest) {
        return null;
    }

    @Override
    public List<BuildPipeline> findBuildPipelines(String applicationId) {
        return null;
    }
}
