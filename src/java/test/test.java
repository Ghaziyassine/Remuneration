/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Remuneration;
import entities.Salarie;
import java.rmi.RemoteException;
import java.util.Date;
import services.RemunerationService;
import services.SalarieService;

/**
 *
 * @author HP
 */
public class test {
    public static void main(String[] args)  {
        SalarieService ss = new SalarieService();
        RemunerationService rs = new RemunerationService();
        Salarie s = new Salarie("yassine ghazi", "06666666", "marketing");
        Salarie s1 = new Salarie("bennan ilyas", "06666666", "finance");
        Salarie s2 = new Salarie("errasekh youssef", "06666666", "marsa");
        Salarie s3 = new Salarie("mninou nassim", "06666666", "Domain");
        Remuneration r= new Remuneration(new Date(), 55, s3);
       
        
        for( Remuneration rr : rs.findBySalarie(8)){
            System.out.println(rr);
        }
    }
}
