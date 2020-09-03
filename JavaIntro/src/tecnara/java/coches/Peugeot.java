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
public class Peugeot extends Coche{
    public Peugeot(String color, int potencia) {
        super(color, potencia);
    }

    @Override
    public void arrancar() {
        this.encendido = true;
        System.out.println("Arrancado con boton!");
    }

    @Override
    public void iniciarReproduccion() {
        System.out.println("Reproduciendo desde un peugeot");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo desde un peugeot");
    }
}
