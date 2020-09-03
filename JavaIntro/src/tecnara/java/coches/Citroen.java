/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.coches;

/**
 *
 * @author marco
 */
public class Citroen extends Coche{

    public Citroen(String color, int potencia) {
        super(color, potencia);
    }

    @Override
    public void arrancar() {
        this.encendido = true;
        System.out.println("Arrancado con llave!");
    }
    
}
