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
public class Ballena  extends Animal implements INadable{

    @Override
    public String show() {
        return "Soy una ballena que canta bajo el agua";
    }

    @Override
    public String showDeNatacion() {
        return "Soy una ballena que salpica al publico";
    }
    
}
