package com.jervis.springframework.beans.factory;

import com.jervis.springframework.beans.BeansException;
import com.jervis.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.jervis.springframework.beans.factory.config.BeanDefinition;
import com.jervis.springframework.beans.factory.config.BeanPostProcessor;
import com.jervis.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

//    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
