package io.midsphere.code;

import org.springframework.stereotype.Component;

/**
 * svn 代码版本控制
 * @author liqiwen
 * @since 1.0
 */
@Component
public class SvnCodeProcessor implements CodeProcessor {





    @Override
    public VersionControlTypeEnum versionControlType() {
        return VersionControlTypeEnum.SVN;
    }
}
