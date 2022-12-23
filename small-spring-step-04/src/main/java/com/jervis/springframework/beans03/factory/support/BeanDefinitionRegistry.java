package com.jervis.springframework.beans03.factory.support;

import com.jervis.springframework.beans03.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
