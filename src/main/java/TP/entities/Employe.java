/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dnfat
 */
@Entity
@Table(name = "employe")
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e"),
    @NamedQuery(name = "Employe.findById", query = "SELECT e FROM Employe e WHERE e.id = :id"),
    @NamedQuery(name = "Employe.findByPrenom", query = "SELECT e FROM Employe e WHERE e.prenom = :prenom"),
    @NamedQuery(name = "Employe.findByNom", query = "SELECT e FROM Employe e WHERE e.nom = :nom"),
    @NamedQuery(name = "Employe.findByEmail", query = "SELECT e FROM Employe e WHERE e.email = :email"),
    @NamedQuery(name = "Employe.findByTelephone", query = "SELECT e FROM Employe e WHERE e.telephone = :telephone"),
    @NamedQuery(name = "Employe.findByActif", query = "SELECT e FROM Employe e WHERE e.actif = :actif")})
public class Employe extends Personne {

    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    @Column(name = "ACTIF")
    private short actif;
    @OneToMany(mappedBy = "managerId")
    private Collection<Employe> employeCollection;
    @JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Employe managerId;
    @JoinColumn(name = "MAGASIN_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Magasin magasinId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendeurId")
    private Collection<Commande> commandeCollection;

    public Employe() {
    }

    
    public short getActif() {
        return actif;
    }

    public void setActif(short actif) {
        this.actif = actif;
    }

    public Collection<Employe> getEmployeCollection() {
        return employeCollection;
    }

    public void setEmployeCollection(Collection<Employe> employeCollection) {
        this.employeCollection = employeCollection;
    }

    public Employe getManagerId() {
        return managerId;
    }

    public void setManagerId(Employe managerId) {
        this.managerId = managerId;
    }

    public Magasin getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Magasin magasinId) {
        this.magasinId = magasinId;
    }

    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    
    
}
