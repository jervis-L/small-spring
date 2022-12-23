package com.jervis.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
