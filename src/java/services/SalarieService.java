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
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
/**
 *
 * @author HP
 */
public class SalarieService  implements IDao<Salarie> {

    public SalarieService() {
    }

    @Override
    public boolean create(Salarie o)  {
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
    public boolean update(Salarie o)  {
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
    public boolean delete(Salarie o)  {
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
    public Salarie findById(int id) {
        Session session = null;
        Transaction tx = null;
        Salarie salarie = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            salarie = (Salarie) session.get(Salarie.class, id);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return salarie;
    }

    @Override
    public List<Salarie> findAll() {
        Session session = null;
        Transaction tx = null;
        List<Salarie> salaries = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            salaries = session.getNamedQuery("findAllSalaries").list();
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            if (session != null) {
                session.close();
            }
        }
        return salaries;
    }

}