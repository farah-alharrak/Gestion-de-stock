/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class StockFacade extends AbstractFacade<Stock> {

    @PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StockFacade() {
        super(Stock.class);
    }
    
     
    public Boolean CreationStock(String NomStock) {
    Boolean retour=false;
    Stock St=(Stock) em.find(Stock.class, NomStock);
    if(St!=null)
    {

     return(retour);
    }

     else {

     St=new Stock(NomStock);
    em.persist(St);
    }
    return(true);
}
    
    
    public Boolean EntreeStock(String nomStock, String refProduit, int quantite) {
    Stock s=em.find(Stock.class, nomStock);
        if(s!=null)
        {
           if(s.getListStock()==null)
           {
               ElementDeStock ei = new ElementDeStock(refProduit, quantite);
               List<ElementDeStock> l = new ArrayList<ElementDeStock>()  ;
               l.add(ei);
               ListDeStock listStck = new ListDeStock(l);
               s.setListStock(listStck);
               return true;
           }else {
               ElementDeStock e = s.getListStock().contient(refProduit);
                if(e==null)
                {
                    ElementDeStock newE = new ElementDeStock(refProduit, quantite);
                    s.getListStock().getElementStock().add(newE);
                }else
                {
                    e.setQuantite(e.getQuantite() + quantite);
                }
                return true;
           }
             
        }
        
        return false;
    } 
    
    
    public Boolean SortieStock(String nomStock, String refProduit, int quantite) {
      Stock s=em.find(Stock.class, nomStock);
        if(s!=null)
        {
           
               ElementDeStock e = s.getListStock().contient(refProduit);
                if(e==null || (e.getQuantite()<quantite))
                {
                    return false;
                }else
                { 
                    e.setQuantite(e.getQuantite() - quantite);
                }
                return true;
           }
             
        
        return false;
    }
    
    
    public Boolean ModifierElementStock(String nomStock, String refProduit, int quantite) {
    Stock s=em.find(Stock.class, nomStock);
        if(s!=null)
        {
           if(s.getListStock()==null || s.getListStock().contient(refProduit)==null )
           {
               
               return false;
           }else {
               ElementDeStock e = s.getListStock().contient(refProduit);
                    e.setRefProduit(refProduit);
                    e.setQuantite(quantite);
                
                return true;
           }
             
        }
        
        return false; 
        
    } 
    
    
    
    
    
    
    
}
