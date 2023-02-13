package sn.ept.git.dic2.scratch_tp.entities;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.scratch_tp.entities.Commande;
import sn.ept.git.dic2.scratch_tp.entities.Produit;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-13T16:08:10", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ArticleCommande.class)
public class ArticleCommande_ { 

    public static volatile SingularAttribute<ArticleCommande, Produit> produitId;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> prixDepart;
    public static volatile SingularAttribute<ArticleCommande, Integer> id;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> remise;
    public static volatile SingularAttribute<ArticleCommande, Commande> commande;
    public static volatile SingularAttribute<ArticleCommande, Integer> quantite;

}