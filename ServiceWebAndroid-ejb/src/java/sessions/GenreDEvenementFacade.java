/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.GenreDEvenement;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ilias
 */
@Stateless
public class GenreDEvenementFacade extends AbstractFacade<GenreDEvenement> implements GenreDEvenementFacadeLocal {

    @PersistenceContext(unitName = "ServiceWebAndroid-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GenreDEvenementFacade() {
        super(GenreDEvenement.class);
    }
    
}
