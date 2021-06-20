package com.rao.component.lock;

import com.rao.component.annotation.EnableLockManagement;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.Nullable;

/**
 * @author raojing
 * @date 2021/6/20 22:06
 */
@Configuration
public abstract class AbstractLockManagementConfiguration implements ImportAware {

    @Nullable
    protected AnnotationAttributes enableLock;

    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        this.enableLock = AnnotationAttributes.fromMap(importMetadata.getAnnotationAttributes(EnableLockManagement.class.getName(), false));
        if (this.enableLock == null) {
            throw new IllegalArgumentException("@EnableLockManagement is not present on importing class " + importMetadata.getClassName());
        }
    }
}
