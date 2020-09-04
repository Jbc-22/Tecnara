/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.coches.tombola;

import tecnara.java.coches.bicis.Bicicleta;
import tecnara.java.coches.tipos.Peugeot;
import tecnara.java.coches.ifaces.IMusicable;

/**
 *
 * @author marco
 */
public class Tombola {
    public IMusicable sortearElemento(){
            int numeroAleatorio = (int) (Math.random() * 10); //0.256325    ->   2.56325   -> 2
            if(numeroAleatorio < 5){
                return new Bicicleta();
            }else{
                return new Peugeot("rojo", 3);
            }
    }
}
