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
    public Object invoke(MethodInvocation invocation) throws Throwable {
        // todo 执行加锁和释放锁的操作
        Object obj = null;
        try {
            System.out.println("获取本地锁");
            System.out.println("获取分布式锁");
            obj = invocation.proceed();
        } catch (Exception e) {
            System.out.println("出错了。。。");
        } finally {
            System.out.println("释放分布式锁");
            System.out.println("释放本地锁");
        }
        return obj;
    }
}
