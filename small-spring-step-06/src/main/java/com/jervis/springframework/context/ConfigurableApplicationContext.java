package com.jervis.springframework.context;

import com.jervis.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext{

    void refresh() throws BeansException;
}
