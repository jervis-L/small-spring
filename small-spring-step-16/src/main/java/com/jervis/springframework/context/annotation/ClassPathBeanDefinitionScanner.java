package com.jervis.springframework.context.annotation;


import cn.hutool.core.util.StrUtil;
import com.jervis.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import com.jervis.springframework.beans.factory.config.BeanDefinition;
import com.jervis.springframework.beans.factory.support.BeanDefinitionRegistry;
import com.jervis.springframework.stereotype.Component;

import java.util.Set;

public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {

    private BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    public void doScan(String... basePackages) {
        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidates = findCandidateComponents(basePackage);
            for (BeanDefinition beanDefinition : candidates) {
                String beanScope = resolveBeanScope(beanDefinition);
                if(StrUtil.isNotEmpty(beanScope)){
                    beanDefinition.setScope(beanScope);
                }
                registry.registerBeanDefinition(determineBeanName(beanDefinition),beanDefinition);
            }
        }
        registry.registerBeanDefinition("com.jervis.springframework.factory.annotation.internalAutowiredAnnotationProcessor", new BeanDefinition(AutowiredAnnotationBeanPostProcessor.class));
    }

    private String resolveBeanScope(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Scope scope = beanClass.getAnnotation(Scope.class);
        if (null != scope) {
            return scope.value();
        }
        return StrUtil.EMPTY;
    }

    private String determineBeanName(BeanDefinition beanDefinition) {
        Class<?> beanClass = beanDefinition.getBeanClass();
        Component component = beanClass.getAnnotation(Component.class);
        String value=component.value();
        if(StrUtil.isEmpty(value)){
            value = StrUtil.lowerFirst(beanClass.getSimpleName());
        }
        return value;
    }

}
