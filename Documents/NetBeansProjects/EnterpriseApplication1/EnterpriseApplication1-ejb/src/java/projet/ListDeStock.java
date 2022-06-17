/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */
public class ListDeStock implements Serializable{
    
    private List<ElementDeStock> elementStock ;

    public void setElementStock(List<ElementDeStock> elementStock) {
        this.elementStock = elementStock;
    }

    public List<ElementDeStock> getElementStock() {
        return elementStock;
    }
    
}
