/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Maurício
 */

@Stateless
public class RepositorioUsuario {

    @PersistenceContext
    private EntityManager em;

    public void criar(Usuario usuario) {
        em.persist(usuario);
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> result = new ArrayList<Usuario>();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Usuario> criteriaQuery = builder.createQuery(Usuario.class);
        TypedQuery<Usuario> typedQuery = em.createQuery(criteriaQuery);
        result = typedQuery.getResultList();
        return result;
    }
}
