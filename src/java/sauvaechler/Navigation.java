/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvaechler;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author thomas.sauvajon
 */
@Named(value = "navigation")
@SessionScoped
//@ManagedBean
public class Navigation {

    /**
     * Creates a new instance of Navigation
     */
    public Navigation() {
    }
    
    public String hello() {
        return "hello";
    }
    
}
