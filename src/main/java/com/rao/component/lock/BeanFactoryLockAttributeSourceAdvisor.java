package com.rao.component.lock;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author raojing
 * @date 2021/6/20 22:21
 */
public class BeanFactoryLockAttributeSourceAdvisor extends AbstractBeanFactoryPointcutAdvisor {

    @Override
    public Pointcut getPointcut() {
        // 获取到对应的切面（根据注解） todo
        return new LockAttributeSourcePointcut();
    }
}
