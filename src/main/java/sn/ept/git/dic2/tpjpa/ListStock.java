/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.tpjpa;

import TP.entities.Produit;
import TP.entities.Stock;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dnfat
 */
public class ListStock {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Production_PU");
        EntityManager em = emf.createEntityManager();
       
        List<Stock> stocks;
        Query requete = em.createNativeQuery("SELECT * FROM Stock");
        stocks = requete.getResultList();
        
        for (Object ligneAsObject : stocks){
            
            Object[] ligne = (Object[])ligneAsObject ;
            
            Integer magasin_id = (Integer)ligne[0];
            Integer produit_id = (Integer)ligne[1];
            Integer quantite = (Integer)ligne[2];
            System.out.println(magasin_id + "    " + produit_id + "    " + quantite);
        }
        
        
        em.close();
        emf.close();
    }
}
