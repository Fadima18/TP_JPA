package sn.ept.git.dic2.scratch_tp.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.scratch_tp.entities.Commande;
import sn.ept.git.dic2.scratch_tp.entities.Employe;
import sn.ept.git.dic2.scratch_tp.entities.Magasin;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T16:08:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Employe.class)
public class Employe_ extends Personne_ {

    public static volatile SingularAttribute<Employe, Magasin> magasinId;
    public static volatile SingularAttribute<Employe, Short> actif;
    public static volatile SingularAttribute<Employe, Employe> managerId;
    public static volatile CollectionAttribute<Employe, Employe> employeCollection;
    public static volatile CollectionAttribute<Employe, Commande> commandeCollection;

}