package com.jervis.springframework.core.convert.support;

import cn.bugstack.springframework.util.NumberUtils;
import com.jervis.springframework.core.convert.converter.Converter;
import com.jervis.springframework.core.convert.converter.ConverterFactory;
import com.sun.istack.internal.Nullable;

public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {
    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return null;
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()){
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }
}
