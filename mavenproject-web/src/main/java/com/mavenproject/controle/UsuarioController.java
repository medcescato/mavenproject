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

/**
 *
 * @author Maurício
 */

@Stateless
@ManagedBean
public class UsuarioController {
    
    @EJB RepositorioUsuario repUsuario; 
    
    private List<Usuario> lista;
    
    public String init() {
        lista = repUsuario.getUsuarios();
        System.out.println("Numero de usuarios cadastrados: " + lista.size());
        return "/usuarios/lista";
    }

    public List<Usuario> getLista() {
        return lista;
    }
    
}
