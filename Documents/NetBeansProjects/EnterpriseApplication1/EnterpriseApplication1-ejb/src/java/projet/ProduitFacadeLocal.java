/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projet;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hp
 */
@Local
public interface ProduitFacadeLocal {

    void create(Produit produit);

    void edit(Produit produit);

    void remove(Produit produit);

    Produit find(Object id);

    List<Produit> findAll();

    List<Produit> findRange(int[] range);

    int count();
    
    Boolean CreationProduit(String referenceProduit, String marqueProduit, String denomination, double prix, double poids, double volume);

    Boolean SuppressionProduit(String RefProduit);

    Boolean ModifierProduit(String referenceProduit, String marqueProduit, String denomination, double prix, double poids, double volume);

    Boolean ExistProduit(String RefProduit);
    
    List<Produit> findAllByMarque(String nomM);
    
}
