/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sn.ept.git.dic2.scratch_tp;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author dnfat
 */
public class Scratch_TP {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("new_velos_vente_PU");
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
    }
}
