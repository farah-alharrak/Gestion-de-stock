/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> implements ProduitFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }

    @Override
    public Boolean CreationProduit(String referenceProduit, String marqueProduit, String denomination, double prix, double poids, double volume) {

        Boolean retour=false;
        Produit Pr=(Produit) em.find(Produit.class, referenceProduit);
        if(Pr!=null)
        {


           return(retour);
        }

        else {
            Marque Mr = (Marque) em.find(Marque.class, marqueProduit);
            
            Pr=new Produit(referenceProduit, Mr, denomination, prix, poids, volume );
            em.persist(Pr);
        }

        return(true);
    }

    @Override
    public Boolean SuppressionProduit(String referenceProduit) {

        Boolean retour = false;
        
        Produit p = (Produit) em.find(Produit.class, referenceProduit);
        if(p==null){
        return retour;
        }
        else{
        remove(p);
        }
        return true;
    }

    @Override
    public Boolean ModifierProduit(String refProduit, String marqueProduit, String denomination, double prix, double poids, double volume) {
        Boolean r = false;
        Produit p = (Produit) em.find(Produit.class, refProduit);
        Marque marqueProd = (Marque) em.find(Marque.class, marqueProduit);
        if(p==null){return r;}
        else{
        Produit prod = new Produit(refProduit, marqueProd, denomination, prix, poids, volume);
        edit(prod);
        
        }
        return true;


    }
    
    @Override
    public List<Produit> findAll(){
        return em.createQuery("select object(o) from Produit as o").getResultList();
    }
    

        

    @Override
    public List<Produit> findAllByMarque(String nomM) {


        return em.createQuery( "SELECT object(o) from Produit as o WHERE o.marqueProduit.marqueReference = :marque").setParameter("marque", nomM).getResultList();    }
    
}
