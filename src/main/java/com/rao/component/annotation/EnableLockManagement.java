package com.rao.component.annotation;

/**
 * @author raojing
 * @date 2021/6/19 23:06
 */

import com.rao.component.lock.LockManagementConfigurationSelector;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LockManagementConfigurationSelector.class)
public @interface EnableLockManagement {

    boolean proxyTargetClass() default false;

    AdviceMode mode() default AdviceMode.PROXY;

    int order() default Ordered.LOWEST_PRECEDENCE;
}
