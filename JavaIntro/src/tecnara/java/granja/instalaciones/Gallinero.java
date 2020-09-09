package tecnara.java.granja.instalaciones;

import java.util.*;
import tecnara.java.granja.animales.aves.Ave;
import tecnara.java.granja.animales.aves.Gallina;
import tecnara.java.granja.animales.aves.Pavo;

public class Gallinero {

    private List<Ave> aves = new ArrayList<Ave>();

    public List<Ave> getAves() {
        return aves;
    }

    public void meterAve(Ave ave) {
        aves.add(ave);
        if (ave instanceof Gallina) {
            mostrarMensajeInsercion("gallina");
        } else if (ave instanceof Pavo) {
            mostrarMensajeInsercion("pavo");
        }
    }
    
    public Gallina sacarGallina() {
        for(Ave ave : this.aves){
            if(ave instanceof Gallina){
                return (Gallina)this.aves.remove(this.aves.indexOf(ave));
            }
        }
        return null;
    }

    public void mostrarMensajeInsercion(String tipoDeAve) {

        System.out.println("Has metido un/a " + tipoDeAve + ". Tienes " + aves.size() + " aves metidas, " + getNumeroDeGallinas() + " gallinas y "
                + getNumeroDePavos() + " pavos.");

    }

    public void cogerHuevos() {

        if (getNumeroDeGallinas() == 0) {
            System.out.println("Lo siento, no puedes coger huevos. No hay gallinas");
        } else {
            System.out.println("Has cogido 2 huevos para un rico desayuno!!");
        }

    }

    public int getNumeroDeGallinas() {

        int numeroDeGallinas = 0;

        for (Ave ave : aves) {
            if (ave instanceof Gallina) {

                numeroDeGallinas++;
            }
        }

        return numeroDeGallinas;
    }

    public int getNumeroDePavos() {

        int numeroDePavos = 0;

        for (Ave ave : aves) {
            if (ave instanceof Pavo) {

                numeroDePavos++;
            }
        }

        return numeroDePavos;
    }

}
