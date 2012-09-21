/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author Maurício
 */

@Entity
@Named
@Model
public class Usuario {

    @Id @GeneratedValue
    private Long id;
    
    @Size(min=8, max=10, message="{usuario.conta.invalida}")
    private String conta;
    
    @Size(min=8, max=12, message="{usuario.senha.invalida}")
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
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
