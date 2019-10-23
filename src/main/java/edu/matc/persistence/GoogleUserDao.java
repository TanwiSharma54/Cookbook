package edu.matc.persistence;

import edu.matc.entity.GoogleUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.io.Serializable;

//TODO Add methods to enable full CRUD on the Author
public class GoogleUserDao implements Serializable{
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get GoogleUser by id
     */
   public GoogleUser getById(int userId) {
        Session session = sessionFactory.openSession();
       GoogleUser googleUser = session.get( GoogleUser.class, userId );
        session.close();
        return googleUser;
    }

    /**
     * update GoogleUser
     * @param GoogleUser  Author to be inserted or updated
     */
   /* public void saveOrUpdate(GoogleUser GoogleUser) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(GoogleUser);
        transaction.commit();
        session.close();
    }*/

    /**
     * insert GoogleUser
     * @param GoogleUser  Author to be inserted
     */
    public int insert(GoogleUser GoogleUser) {
        int userId = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        userId = (int)session.save(GoogleUser);
        transaction.commit();
        session.close();
        return userId;
    }

    /**
     * Delete a GoogleUser
     * @param GoogleUser GoogleUser to be deleted
     */
   /* public void delete(GoogleUser GoogleUser) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(GoogleUser);
        transaction.commit();
        session.close();
    }*/



}
