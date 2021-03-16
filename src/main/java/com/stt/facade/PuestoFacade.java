/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stt.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import stt.com.entety.Puesto;

/**
 *
 * @author STT
 */
@Stateless
public class PuestoFacade extends AbstractFacade<Puesto> {

    @PersistenceContext(unitName = "stt.com_demo-web-jpa_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PuestoFacade() {
        super(Puesto.class);
    }
    
}
