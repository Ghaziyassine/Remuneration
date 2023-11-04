/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
@Entity
@NamedQueries({
@NamedQuery(name = "findAll", query = "from Remuneration"),
@NamedQuery(name = "findBySalarie", query = "SELECT r FROM Remuneration r WHERE r.salarie.id = :salarie")})

public class Remuneration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date ;
    private double montant;
@ManyToOne
private Salarie salarie;
    public Remuneration() {
    }

    public Remuneration(Date date, double montant, Salarie salarie) {
        this.date = date;
        this.montant = montant;
        this.salarie = salarie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Salarie getSalarie() {
        return salarie;
    }

    public void setSalarie(Salarie salarie) {
        this.salarie = salarie;
    }

    @Override
    public String toString() {
        return "Remuneration{" + "id=" + id + ", date=" + date + ", montant=" + montant + ", salarie=" + salarie + '}';
    }


}
