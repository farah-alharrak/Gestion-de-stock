/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String referenceProduit;
    
    @ManyToOne
    private Marque marqueProduit;
    
    private String denomination;
    
    private int prix;
    
    private float poids;
    
    private float volume;
    
    public Produit(){
        super();
    }
    
    public Produit(String nom,int p){
        referenceProduit=nom;
        prix=p;
    }

    /**
     * Get the value of Prix
     *
     * @return the value of Prix
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Set the value of Prix
     *
     * @param prix new value of Prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }


    public String getReferenceProduit() {
        return referenceProduit;
    }

    public void setReferenceProduit(String referenceProduit) {
        this.referenceProduit = referenceProduit;
    }
    
    public Marque getMarqueProduit() {
        return marqueProduit;
    }

    
    public void setMarqueProduit(Marque marqueProduit) {
        this.marqueProduit = marqueProduit;
    }
    
    public String getDenomination(){
         return denomination;
    }
    public void setDenomination(String denomination){
         this.denomination=denomination;
    }
 
    public float getPoids(){
         return poids;
    }
    public void setPoids(float poids){
         this.poids=poids;
    }
    
    public float getVolume(){
         return volume;
    }
    public void setVolume(float volume){
         this.volume=volume;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceProduit != null ? referenceProduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.referenceProduit == null && other.referenceProduit != null) || (this.referenceProduit != null && !this.referenceProduit.equals(other.referenceProduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projet.Produit[ id=" + referenceProduit + " ]";
    }
    
}
