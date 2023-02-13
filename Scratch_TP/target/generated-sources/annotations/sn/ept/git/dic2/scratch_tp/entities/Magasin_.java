package sn.ept.git.dic2.scratch_tp.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.scratch_tp.entities.Adresse;
import sn.ept.git.dic2.scratch_tp.entities.Commande;
import sn.ept.git.dic2.scratch_tp.entities.Employe;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T16:08:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Magasin.class)
public class Magasin_ { 

    public static volatile SingularAttribute<Magasin, Adresse> adresse;
    public static volatile SingularAttribute<Magasin, String> telephone;
    public static volatile SingularAttribute<Magasin, Integer> id;
    public static volatile SingularAttribute<Magasin, String> nom;
    public static volatile CollectionAttribute<Magasin, Employe> employeCollection;
    public static volatile SingularAttribute<Magasin, String> email;
    public static volatile CollectionAttribute<Magasin, Commande> commandeCollection;

}