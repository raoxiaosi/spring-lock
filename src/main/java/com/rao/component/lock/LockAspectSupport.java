package com.rao.component.lock;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author raojing
 * @date 2021/6/20 22:32
 */
public abstract class LockAspectSupport implements BeanFactoryAware, InitializingBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
