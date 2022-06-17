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
public class MarqueFacade extends AbstractFacade<Marque> implements MarqueFacadeLocal {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarqueFacade() {
        super(Marque.class);
    }

    @Override
    public Boolean creer(String nom, String pays) {
        if((Marque)em.find(Marque.class, nom) != null)
        {
            return false;
        }
        create(new Marque(nom,pays));
        return true;
    }

    @Override
    public Boolean supprimer(String nom) {
        Marque m = (Marque)em.find(Marque.class, nom);
        if(m != null){
            em.remove(m);
            return true;
        }
        return false;
    }
    
    @Override
    public List<Produit> listerProduits(String nom) {
        Marque m = (Marque)em.find(Marque.class, nom);
        if(m != null)
            return m.getListeProduits();
        return null;
    }

    @Override
    public Boolean ajouterProduit(Marque marque, Produit produit) {
        Marque m = (Marque)em.find(Marque.class, marque.getMarqueReference());
        if(m != null)
        {
            Produit p = (Produit)em.find(Produit.class, produit.getReferenceProduit());
            if(p != null){
                m.getListeProduits().add(p);
                em.merge(m);
                return true;
            }else
                return false;
        }else
            return false;
    }   
}
