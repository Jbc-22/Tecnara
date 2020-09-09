/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.granja.instalaciones;

import java.util.ArrayList;
import java.util.List;
import tecnara.java.granja.animales.aves.Ave;
import tecnara.java.granja.animales.aves.Gallina;
import tecnara.java.granja.animales.mamiferos.Vaca;
import tecnara.java.granja.ifaces.Pastoreable;

/**
 *
 * @author marco
 */
public class Redil {
    List<Pastoreable> rebano = new ArrayList<>(); 
    
    public void meterAnimal(Pastoreable animal){
        this.rebano.add(animal);
    }
    
    public Pastoreable sacarAnimal(){
        if(!this.rebano.isEmpty())
            return this.rebano.remove(0);
        
        return null;
    }
    
    public Gallina sacarGallina() {
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                return (Gallina)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }
    
    public Vaca sacarVaca() {
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                return (Vaca)this.rebano.remove(this.rebano.indexOf(pastoreable));
            }
        }
        return null;
    }
    
    public void pastorearAnimales(){
        for(Pastoreable animal : rebano){
            animal.pastorear();
        }
    }
    
    public void informarEstado(){
        System.out.println(new StringBuilder().append("Tengo ")
                .append(this.rebano.size())
                .append(" animales. ")
                .append(this.getNumeroDeVacas())
                .append(" vacas y ")
                .append(this.getNumeroDeGallinas())
                .append(" gallinas.")
                .toString());
    }
    
    public int getNumeroDeVacas(){
        int vacas = 0;
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Vaca){
                vacas++;
            }
        }
        return vacas;
    }
    
    public int getNumeroDeGallinas(){
        int gallinas = 0;
        for(Pastoreable pastoreable : this.rebano){
            if(pastoreable instanceof Gallina){
                gallinas++;
            }
        }
        return gallinas;
    }
}
