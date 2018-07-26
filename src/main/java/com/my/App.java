package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jyt
 * @date 2018/6/12 下午2:13
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = App.class)
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class,args);
    }
}
