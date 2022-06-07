/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.io.Serializable;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class Marque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String marqueReference;

    public String getMarqueReference() {
        return marqueReference;
    }
    
    public void setMarqueReference(String marqueReference) {
        this.marqueReference = marqueReference;
    }

    private String origine;
    
    public String getOrigine (){
        return origine;
    }
    
    public void setOrigine(String origine){
        this.origine = origine;
    }
    
    @OneToMany
    private List<Produit> listeProduits = new ArrayList<>();
    
   public List<Produit> getListeProduits(){
         return listeProduits;
    }
    
    public void setListeProduits(List<Produit> ListeDesProduits){
         this.listeProduits=ListeDesProduits;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marqueReference!= null ? marqueReference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marque)) {
            return false;
        }
        Marque other = (Marque) object;
        if ((this.marqueReference == null && other.marqueReference != null) || (this.marqueReference != null && !this.marqueReference.equals(other.marqueReference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projet.Marque[ id=" + marqueReference + " ]";
    }
    
}
