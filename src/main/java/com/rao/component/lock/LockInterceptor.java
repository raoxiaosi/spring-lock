package com.rao.component.lock;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.io.Serializable;

/**
 * @author raojing
 * @date 2021/6/20 22:31
 */
public class LockInterceptor extends LockAspectSupport implements MethodInterceptor, Serializable {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // todo 执行加锁和释放锁的操作
        return null;
    }
}
