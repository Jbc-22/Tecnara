/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.zoo.animales;

import tecnara.java.zoo.animales.ifaces.INadable;

/**
 *
 * @author marco
 */
public class Delfin extends Animal implements INadable{

    @Override
    public String show() {
        return "Soy un delfín que come peces";
    }

    @Override
    public String showDeNatacion() {
        return "Soy un delfin que da saltos en el agua";
    }
    
}
