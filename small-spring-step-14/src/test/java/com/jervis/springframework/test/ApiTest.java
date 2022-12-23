package com.jervis.springframework.test;


import com.jervis.springframework.context.support.ClassPathXmlApplicationContext;
import com.jervis.springframework.test.bean.IUserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springjervis.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
