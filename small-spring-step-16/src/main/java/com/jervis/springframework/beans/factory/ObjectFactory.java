package com.jervis.springframework.beans.factory;

import com.jervis.springframework.beans.BeansException;

public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
