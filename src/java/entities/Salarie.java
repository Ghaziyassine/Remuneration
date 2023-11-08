/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author HP
 */
@Entity

@NamedQuery(name = "findAllSalaries", query = "from Salarie")

public class Salarie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String tele;
    private String service;
    @OneToMany(mappedBy = "salarie" , fetch = FetchType.EAGER)
    private List<Remuneration> remunerations;

    public Salarie() {
    }

    public Salarie(String nom, String tele, String service) {
        this.nom = nom;
        this.tele = tele;
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public List<Remuneration> getRemunerationss() {
        return remunerations;
    }

    public void setRemunerations(List<Remuneration> machines) {
        this.remunerations = remunerations;
    }

    @Override
    public String toString() {
        return " " + "id=" + id + ", nom=" + nom + ' ';
    }

  
   

   
}
