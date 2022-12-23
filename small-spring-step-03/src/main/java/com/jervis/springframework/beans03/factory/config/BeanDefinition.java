package com.jervis.springframework.beans03.factory.config;

public class BeanDefinition {
//    为啥不用泛型？
    private Class beanClass;

    public BeanDefinition(Class beanClass){this.beanClass=beanClass;}

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
