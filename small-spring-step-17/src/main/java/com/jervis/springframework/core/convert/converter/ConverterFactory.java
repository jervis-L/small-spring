package com.jervis.springframework.core.convert.converter;

public interface ConverterFactory<S,R> {
//泛型方法， T extends R
    <T extends R> Converter<S,T> getConverter(Class<T> targetType);
}


