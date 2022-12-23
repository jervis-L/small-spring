package com.jervis.springframework.context.event;


import com.jervis.springframework.beans.factory.BeanFactory;
import com.jervis.springframework.context.ApplicationEvent;
import com.jervis.springframework.context.ApplicationListener;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for(final ApplicationListener listener:getApplicationListers(event)){
            listener.onApplicationEvent(event);
        }
    }
}
