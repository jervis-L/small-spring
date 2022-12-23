package com.jervis.springframework.beans03.factory;


import com.jervis.springframework.beans03.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
