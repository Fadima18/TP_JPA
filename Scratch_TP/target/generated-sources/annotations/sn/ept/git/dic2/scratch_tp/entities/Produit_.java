package sn.ept.git.dic2.scratch_tp.entities;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.scratch_tp.entities.Categorie;
import sn.ept.git.dic2.scratch_tp.entities.Marque;
import sn.ept.git.dic2.scratch_tp.entities.Stock;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T16:08:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Categorie> categorieId;
    public static volatile SingularAttribute<Produit, Short> anneeModel;
    public static volatile CollectionAttribute<Produit, Stock> stockCollection;
    public static volatile SingularAttribute<Produit, BigDecimal> prixDepart;
    public static volatile SingularAttribute<Produit, Marque> marqueId;
    public static volatile SingularAttribute<Produit, Integer> id;
    public static volatile SingularAttribute<Produit, String> nom;

}