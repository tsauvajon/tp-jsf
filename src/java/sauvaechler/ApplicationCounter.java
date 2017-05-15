/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvaechler;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author thomas.sauvajon
 */
// @Named(value = "applicationCounter")
// @Dependent
@ManagedBean
@ApplicationScoped
public class ApplicationCounter implements Serializable {
    
    private static final long serialVersionUID = 7983140976075649622L;
    int value = 0;
    
    public Integer getCounter() {
        return ++value;
    }
    
    @PostConstruct
    void init() {
        System.err.println("Create " + this);
    }
    
    @PreDestroy
    void close() {
        System.err.println("Close " + this);
    }

    /**
     * Creates a new instance of ApplicationCounter
     */
    public ApplicationCounter() {
    }
    
}
