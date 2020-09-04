/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.zoo.main;

import tecnara.java.zoo.Zoo;
import tecnara.java.zoo.animales.Leon;
import tecnara.java.zoo.animales.Tortuga;

/**
 *
 * @author marco
 */
public class Main {
    public static void main(String[] args){
        Tortuga t = new Tortuga();
        Leon l = new Leon();
        Zoo.performShow(l);
        Zoo.performShow(t);
    }
}
