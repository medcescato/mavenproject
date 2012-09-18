/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.validation.constraints.Size;

/**
 *
 * @author Maurício
 */

@Model
@Named
public class Usuario {

    @Size(min=5, max=10, message="{usuario.conta.invalida}")
    private String conta;
    
    @Size(min=8, max=12, message="{usuario.senha.invalida}")
    private String senha;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
