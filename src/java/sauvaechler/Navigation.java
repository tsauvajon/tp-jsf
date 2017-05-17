/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvaechler;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author thomas.sauvajon
 */
@Named(value = "navigation")
@SessionScoped
//@ManagedBean
public class Navigation implements Serializable{

    /**
     * Creates a new instance of Navigation
     */
    public Navigation() {
    }
    
    public String hello() {
        return "hello";
    }
    
}
