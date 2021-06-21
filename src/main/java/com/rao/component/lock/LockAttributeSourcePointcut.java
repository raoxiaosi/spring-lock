package com.rao.component.lock;

import com.rao.component.annotation.MyLock;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * @author raojing
 * @date 2021/6/21 21:08
 */
public class LockAttributeSourcePointcut extends StaticMethodMatcherPointcut implements Serializable {

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        if (method.isAnnotationPresent(MyLock.class)) {
            return true;
        }
        return false;
    }
}
