/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvaechler;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author thomas.sauvajon
 */
//@Named(value = "navigation")
//@Dependent
@ManagedBean
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
