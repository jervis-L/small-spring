package com.jervis.springframework.beans.factory;

public interface DisposableBean {

    void destroy() throws Exception;

}
