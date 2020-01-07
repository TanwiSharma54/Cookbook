package com.tanwisharma.persistence;

import com.tanwisharma.entity.Role;
import com.tanwisharma.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.io.Serializable;

/**
 * A persistance class for performing CRUD on user.
 *
 * @author tanwi
 */
public class RoleDao implements Serializable {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get GoogleUser by id
     */
    public Role getById(int id) {
        Session session = sessionFactory.openSession();
        Role role = session.get( Role.class, id);
        session.close();
        return role;
    }

    /**
     * insert User
     * @param role to be inserted
     */
    public int insert(Role role) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(role);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * update User
     * @param user to be inserted or updated
     */
   /* public void saveOrUpdate(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(role);
        transaction.commit();
        session.close();
    }*/



    /**
     * Delete a User
     * @param user to be deleted
     */
   /* public void delete(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }*/

}
