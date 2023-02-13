/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.tpjpa;

import TP.entities.Produit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dnfat
 */
public class ListProduit {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Production_PU");
        EntityManager em = emf.createEntityManager();
       
        List<Produit> produits;
        Query requete = em.createNativeQuery("SELECT * FROM Produit");
        produits = requete.getResultList();
        
        for (Object ligneAsObject : produits){
            
            Object[] ligne = (Object[])ligneAsObject ;
            
            Integer id = (Integer)ligne[0];
            String nom = (String)ligne[1];
            Integer marque_id = (Integer)ligne[2];
            System.out.println(id + "    " + nom + "    " + marque_id);
        }
        
        
        em.close();
        emf.close();
    }
}
