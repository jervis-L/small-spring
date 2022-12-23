package com.jervis.springframework.test.common;


import com.jervis.springframework.beans.BeansException;
import com.jervis.springframework.beans.PropertyValue;
import com.jervis.springframework.beans.PropertyValues;
import com.jervis.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.jervis.springframework.beans.factory.config.BeanDefinition;
import com.jervis.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
