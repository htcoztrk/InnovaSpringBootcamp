package com.innova.databaseHomework.cdi;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "tuketenCDI")
@ApplicationScoped
public class InjectExample implements Serializable {

    // tuketen
    @Inject
    private List<String> tuketenList;

    public List<String> getTuketenList() {
        return tuketenList;
    }

    @Inject
    private String resultInject;

    public String getResultInject() {
        return resultInject;
    }
}
//alternatife
//qualifier
//enumqualifier
//interceptor
//stereotypes