/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.bicis;

import tecnara.java.ifaces.IMusicable;


/**
 *
 * @author marco
 */
public class Bicicleta implements IMusicable{

    @Override
    public void iniciarReproduccion() {
        System.out.println("Estoy sonando en una bicicleta!!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Estoy apagado en una bicicleta!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
