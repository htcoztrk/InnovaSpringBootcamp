package com.innova.databaseHomework.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorAOP")
@ApplicationScoped
public class AopBean implements Serializable {

    @Inject
    private Login login;

    public String getLogin() {
        return login.isLogin();
    }
}
