/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class ElementDeStock implements Serializable{
    private String refProduit;
    private double quantite;

    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getRefProduit() {
        return refProduit;
    }

    public double getQuantite() {
        return quantite;
    }
    
    
}
