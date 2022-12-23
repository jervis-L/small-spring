package com.jervis.springframework.aop;

public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
