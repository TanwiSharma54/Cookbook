package com.tanwisharma.persistence;

import com.tanwisharma.entity.Favorite;
import com.tanwisharma.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
/**
 * A persistance class for performing CRUD operation on user's favorite.
 *
 * @author tanwi
 */
public class FavoriteDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all orders.
     *
     * @return the all orders
     */
    public List<Favorite> getAllFavorite() {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Favorite> query = builder.createQuery(Favorite.class);
        Root<Favorite> root = query.from(Favorite.class);
        List<Favorite> favorites = session.createQuery(query).getResultList();
        session.close();
        return favorites;
    }

    /**
     * @param id
     * @return
     */
    public Favorite getById(int id) {
        Session session = sessionFactory.openSession();
        Favorite favorite = session.get( Favorite.class, id);
        session.close();
        return favorite;
    }
    /**
     * update User
     * @param favorite to be inserted or updated
     */
    public void saveOrUpdate(Favorite favorite) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(favorite);
        transaction.commit();
        session.close();
    }

    /**
     * insert User
     * @param favorite to be inserted
     */
    public int insert(Favorite favorite) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(favorite);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a order
     * @param favorite Order to be deleted
     */
    public void delete(Favorite favorite) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(favorite);
        transaction.commit();
        session.close();
    }
}
