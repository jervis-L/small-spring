package com.jervis.springframework.beans.factory;

import com.jervis.springframework.beans.BeansException;

public interface InitializingBean {

    void afterPropertiesSet() throws BeansException;
}
