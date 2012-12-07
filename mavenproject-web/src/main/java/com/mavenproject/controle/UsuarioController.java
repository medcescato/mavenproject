/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.controle;

import com.mavenproject.modelo.RepositorioUsuario;
import com.mavenproject.modelo.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Maurício
 */

@Stateless
@ManagedBean
@RequestScoped
public class UsuarioController {
    
    @EJB RepositorioUsuario repUsuario; 
    @Inject Usuario usuario;
    
    private List<Usuario> lista;
    
    public String init() {
        return "/usuarios/lista";
    }

    public String novo() {
        String result = "novo";
        print("Vai para: " + result);
        return result;
    }

    public String criar() {
        repUsuario.criar(usuario);
        String result = "editar";
        print("Vai para: " + result);
        return result;
    }
    
    public List<Usuario> getLista() {
        if (lista == null) {
            print("Lista nula, vou carrega-la - ");
            lista = repUsuario.getUsuarios();
            //lista = java.util.Arrays.asList(new Usuario[] {Usuario.monta().comConta("admin"), Usuario.monta().comConta("Mario"), Usuario.monta().comConta("Jose")});
        }
        print("Numero de usuarios cadastrados: " + lista.size());
        return lista;
    }
    
    public void print(String message) {
        System.out.print(this.toString() + ":" + message);
    }
    
}
