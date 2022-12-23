package com.jervis.springframework.beans.factory;


import com.jervis.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
