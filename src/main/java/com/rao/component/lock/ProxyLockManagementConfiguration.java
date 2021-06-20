package com.rao.component.lock;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.core.annotation.Order;

/**
 * @author raojing
 * @date 2021/6/20 22:04
 */
@Configuration
@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
public class ProxyLockManagementConfiguration extends AbstractLockManagementConfiguration {


    @Bean(name = {"org.springframework.transaction.config.internalLockAdvisor"})
    @Role(2)
    public BeanFactoryLockAttributeSourceAdvisor lockAdvisor() {
        BeanFactoryLockAttributeSourceAdvisor advisor = new BeanFactoryLockAttributeSourceAdvisor();
        // todo 找到对应的注解切面，生成代理对象
        return advisor;
    }

    @Bean
    @Order(2)
    public LockInterceptor lockInterceptor() {
        LockInterceptor interceptor = new LockInterceptor();
        // todo 执行增强逻辑-加锁 释放锁
        return interceptor;
    }

}
