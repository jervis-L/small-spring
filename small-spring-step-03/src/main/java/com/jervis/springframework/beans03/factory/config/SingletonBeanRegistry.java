package com.jervis.springframework.beans03.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
