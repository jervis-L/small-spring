package com.jervis.springframework.context;

import com.jervis.springframework.beans.factory.HierarchicalBeanFactory;
import com.jervis.springframework.beans.factory.ListableBeanFactory;
import com.jervis.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
