/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.granja.granjero;

import tecnara.java.granja.animales.Animal;
import tecnara.java.granja.animales.aves.Gallina;
import tecnara.java.granja.animales.mamiferos.Vaca;
import tecnara.java.granja.instalaciones.Establo;
import tecnara.java.granja.instalaciones.Gallinero;
import tecnara.java.granja.instalaciones.Redil;

/**
 *
 * @author marco
 */
public class Granjero {

    public void llevarGallinaARedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = gallinero.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            redil.meterAnimal(gallina);
        } else {
            System.out.println("No había gallinas para llevar al redil");
        }
    }

    public void llevarVacaARedil(Establo establo, Redil redil) {
        Vaca vaca = establo.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            redil.meterAnimal(vaca);
        } else {
            System.out.println("No había vacas para llevar al redil");
        }
    }

    public void calmarAnimal(Animal animal) {
        System.out.println("No te asustes " + animal.getNombre() + ", que te muevo de sitio");
    }

    public void sacarGallinaDelRedil(Gallinero gallinero, Redil redil) {
        Gallina gallina = redil.sacarGallina();
        if (gallina != null) {
            calmarAnimal(gallina);
            gallinero.meterAve(gallina);
        } else {
            System.out.println("No había gallinas para llevar al gallinero");
        }
    }

    public void sacarVacaDelRedil(Establo establo, Redil redil) {
        Vaca vaca = redil.sacarVaca();
        if (vaca != null) {
            calmarAnimal(vaca);
            establo.metermamifero(vaca);
        } else {
            System.out.println("No había vaca para llevar al establo");
        }
    }
}
