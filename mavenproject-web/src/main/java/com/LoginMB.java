/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mavenproject.modelo.Usuario;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Maurício
 */
@ManagedBean
@RequestScoped
@Model
public class LoginMB {
    
    @Inject Usuario usuario;
    
    public String login() {
        System.out.println("conta:" + usuario.getConta());
        System.out.println("senha:" + usuario.getSenha());
        return "welcome";
    }
    
    
}
