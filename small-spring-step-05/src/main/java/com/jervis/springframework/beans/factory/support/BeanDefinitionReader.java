package com.jervis.springframework.beans.factory.support;

import com.jervis.springframework.beans.BeansException;
import com.jervis.springframework.core.io.Resource;
import com.jervis.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
