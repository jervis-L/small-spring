package com.jervis.springframework.beans.factory;

import com.jervis.springframework.beans.BeansException;
import com.jervis.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.jervis.springframework.beans.factory.config.BeanDefinition;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
