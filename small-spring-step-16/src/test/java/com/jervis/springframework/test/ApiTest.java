package com.jervis.springframework.test;


import com.jervis.springframework.context.support.ClassPathXmlApplicationContext;
import com.jervis.springframework.test.bean.Husband;
import com.jervis.springframework.test.bean.Wife;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springjervis.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("老公的媳妇：" + husband.queryWife());
        System.out.println("媳妇的老公：" + wife.queryHusband());
    }
}
