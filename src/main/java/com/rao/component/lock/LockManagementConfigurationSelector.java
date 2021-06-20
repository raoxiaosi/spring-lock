package com.rao.component.lock;

import com.rao.component.annotation.EnableLockManagement;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.context.annotation.AutoProxyRegistrar;

/**
 * @author raojing
 * @date 2021/6/19 23:10
 */
public class LockManagementConfigurationSelector extends AdviceModeImportSelector<EnableLockManagement> {
    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{AutoProxyRegistrar.class.getName(), ProxyLockManagementConfiguration.class.getName()};
            case ASPECTJ:
                throw new RuntimeException("暂不支持 ASPECTJ 方式");
            default:
                return null;
        }
    }
}
