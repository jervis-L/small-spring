package com.jervis.springframework.test;


import com.jervis.springframework.context.support.ClassPathXmlApplicationContext;
import com.jervis.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_hook() {
//        在虚拟机要关闭的时候执行
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("jervis！")));
    }
}
