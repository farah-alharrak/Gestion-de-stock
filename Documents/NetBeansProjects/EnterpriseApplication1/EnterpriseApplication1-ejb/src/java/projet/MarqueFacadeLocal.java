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
public interface MarqueFacadeLocal {

    void create(Marque marque);

    void edit(Marque marque);

    void remove(Marque marque);

    Marque find(Object id);

    List<Marque> findAll();

    List<Marque> findRange(int[] range);

    int count();
    
}
