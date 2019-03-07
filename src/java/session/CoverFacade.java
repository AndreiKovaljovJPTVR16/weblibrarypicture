/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Cover;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
@Stateless
public class CoverFacade extends AbstractFacade<Cover> {

    @PersistenceContext(unitName = "Ptvr16WebLibraryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoverFacade() {
        super(Cover.class);
    }

    public Cover findByName(String name) {
        try {
            return (Cover) em.createQuery("SELECT c FROM Cover c WHERE c.name = :name")
                    .setParameter("name",name)
                    .getSingleResult();

        } catch (Exception e) {
            return null;
        }
    }

}
