/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.coches.tipos;

import tecnara.java.coches.ifaces.IMusicable;

/**
 *
 * @author marco
 */
public abstract class Coche implements IMusicable{
    protected boolean encendido;
    protected String color;
    protected String marca;
    protected int potencia;
    protected int velocidad = 0;
    
    public Coche(String color, int potencia){
        this.color = color;
        this.potencia = potencia;
    }
    
    public abstract void arrancar();
    
    public void parar(){
        System.out.println("he parado");
        this.encendido = false;
    }
    
    public void acelerar(){
        if(this.encendido)
            velocidad++;
    }
    
    public void frenar(){
        if(this.velocidad > 0)
            velocidad--;
    }
    
    @Override
    public void iniciarReproduccion() {
        System.out.println("Reproduciendo musica desde un COCHE....");
    }

    @Override
    public void detenerReproduccion() {
       System.out.println("DETENIENDO musica desde un COCHE....");
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
}
