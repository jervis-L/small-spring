package com.jervis.springframework.context.event;


import com.jervis.springframework.context.ApplicationEvent;
import com.jervis.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
