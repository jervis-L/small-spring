package com.jervis.springframework.beans03.factory.config;

public class BeansReference {
    public String beanName;

    public BeansReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
