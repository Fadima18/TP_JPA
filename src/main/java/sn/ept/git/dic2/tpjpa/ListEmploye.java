/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.tpjpa;

import TP.entities.Employe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author dnfat
 */
public class ListEmploye {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Vente_PU");
        EntityManager em = emf.createEntityManager();
        
        Query requete = em.createQuery("SELECT e.id, e.prenom, e.nom FROM Employe e");
        List<Employe> employees = requete.getResultList();
        
        for (Object ligneAsObject : employees) {

            // ligne correspond à une des lignes du résultat
           Object[] ligne = (Object[])ligneAsObject ;


           Integer id = (Integer)ligne[0];
           String prenom = (String)ligne[1] ;
           String nom = (String)ligne[2] ;

           System.out.println(id+ "  " + nom +  "  " + prenom) ;
        }
        
        em.close();
        emf.close();
    }
}
