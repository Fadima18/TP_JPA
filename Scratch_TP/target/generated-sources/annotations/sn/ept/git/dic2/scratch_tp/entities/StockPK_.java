package sn.ept.git.dic2.scratch_tp.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.scratch_tp.entities.Magasin;
import sn.ept.git.dic2.scratch_tp.entities.Produit;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T16:08:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(StockPK.class)
public class StockPK_ { 

    public static volatile SingularAttribute<StockPK, Produit> produitId;
    public static volatile SingularAttribute<StockPK, Magasin> magasinId;

}