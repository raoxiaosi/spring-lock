package com.rao.service;

import com.rao.component.annotation.MyLock;
import org.springframework.stereotype.Service;

/**
 * @author raojing
 * @date 2021/6/21 21:24
 */
@Service
public class UserService {

    @MyLock
    public void addUser(){
        System.out.println("新增用户");
    }

}
