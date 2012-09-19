/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Contacts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Egorov A.
 */
@Stateless
public class ContactsFacade extends AbstractFacade<Contacts> {
    @PersistenceContext(unitName = "myblogPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactsFacade() {
        super(Contacts.class);
    }
    
}
