package com.jervis.springframework.test;



import com.jervis.springframework.context.support.ClassPathXmlApplicationContext;
import com.jervis.springframework.test.event.CustomEvent;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }
}
