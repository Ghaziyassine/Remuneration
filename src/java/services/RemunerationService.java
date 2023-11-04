/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.IDao;
import entities.Remuneration;
import entities.Salarie;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class RemunerationService implements IDao<Remuneration> {

    public RemunerationService() {

    }

    @Override
    public boolean create(Remuneration o) {
        Session session = null;
        Transaction tx = null;
        boolean etat = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            etat = true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return etat;
    }

    @Override
    public boolean update(Remuneration o) {
        Session session = null;
        Transaction tx = null;
        boolean etat = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            etat = true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return etat;
    }

    @Override
    public boolean delete(Remuneration o) {
        Session session = null;
        Transaction tx = null;
        boolean etat = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            etat = true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return etat;
    }

    @Override
    public Remuneration findById(int id) {
        Session session = null;
        Transaction tx = null;
        Remuneration machine = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            machine = (Remuneration) session.get(Remuneration.class, id);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return machine;
    }

    @Override
    public List<Remuneration> findAll() {
        Session session = null;
        Transaction tx = null;
        List<Remuneration> machines = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            machines = session.getNamedQuery("findAllRemunerations").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return machines;
    }

    public List<Remuneration> findBySalarie(int id) {
    Session session = null;
    Transaction tx = null;
    List<Remuneration> remunerations = null;
    try {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        Query query = session.getNamedQuery("findBySalarie");  // Use getNamedQuery to obtain the named query
        query.setParameter("salarie", id);
        remunerations = query.list();
        tx.commit();
    } catch (HibernateException ex) {
        if (tx != null) {
            tx.rollback();
        }
    } finally {
        if (session != null) {
            session.close();
        }
    }
    return remunerations;
}

   
}
