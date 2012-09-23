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

/**
 *
 * @author Maurício
 */

@Stateless
@ManagedBean
@RequestScoped
public class UsuarioController {
    
    @EJB RepositorioUsuario repUsuario; 
    
    private List<Usuario> lista;
    
    public String init() {
        return "/usuarios/lista";
    }

    public String novo() {
        System.out.println("Vai para /usuarios/novo");
        return "novo";
    }
    
    public List<Usuario> getLista() {
        if (lista == null) {
            System.out.print("Lista nula, vou carrega-la - ");
            //lista = repUsuario.getUsuarios();
            lista = java.util.Arrays.asList(new Usuario[] {Usuario.monta().comConta("admin"), Usuario.monta().comConta("Mario"), Usuario.monta().comConta("Jose")});
        
        }
        System.out.println("Numero de usuarios cadastrados: " + lista.size());
        return lista;
    }
    
}
