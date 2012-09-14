/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Stateless;

/**
 *
 * @author zcpw
 */
@Stateless
public class HelloWorldSB {
    public String hello(String name) {
        String result = "[EJB 3.1] Hello, World !";
        if (name != null || !"".equals(name)) result += " Mr/Mrs " + name + "!";
        return result;
    }
}
