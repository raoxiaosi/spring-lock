package com.rao;

import com.rao.component.annotation.EnableLockManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author raojing
 * @date 2021/6/19 22:34
 */
@EnableLockManagement
//@EnableTransactionManagement(proxyTargetClass = true)
//@EnableCaching
@SpringBootApplication
public class SpringLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLockApplication.class, args);
    }

}
