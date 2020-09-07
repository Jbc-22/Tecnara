/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.zoo;

import tecnara.java.zoo.animales.ifaces.INadable;

/**
 *
 * @author marco
 */
public class Acuario {
    public static void performAquaticShow(INadable animalNadable){
        System.out.println(animalNadable.showDeNatacion());
    }
}
