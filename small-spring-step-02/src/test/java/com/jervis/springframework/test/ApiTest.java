package com.jervis.springframework.test;

import com.jervis.springframework.beans.factory.config.BeanDefinition;
import com.jervis.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.jervis.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){

        DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();

        BeanDefinition beanDefinition= new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        UserService userService= (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userServiceSingleton= (UserService) beanFactory.getSingleton("userService");
        userServiceSingleton.queryUserInfo();
    }
}
