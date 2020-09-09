package tecnara.java.granja.instalaciones;

import tecnara.java.granja.animales.aves.Ave;
import tecnara.java.granja.animales.aves.Gallina;
import tecnara.java.granja.animales.aves.Pavo;



public class Matadero {

    public void matarAve(Gallinero gallinero) {


        if (gallinero != null && gallinero.getAves() != null && !gallinero.getAves().isEmpty()) {

            Ave aveEliminada = gallinero.getAves().remove(0);

            mostrarMensajeEliminacion(gallinero, aveEliminada);

        }
    }

    public void mostrarMensajeEliminacion(Gallinero gallinero, Ave ave){

        System.out.println("Has matado un/a " +dimeTipoDeAve(ave)+ ", concretamente a " + ave.getNombre() + ". Ahora quedan " + gallinero.getNumeroDeGallinas() +
                " gallinas y " + gallinero.getNumeroDePavos() + " pavos.");

    }

    public String dimeTipoDeAve(Ave ave){

         if (ave instanceof Gallina){

             return "gallina";

         } else if (ave instanceof Pavo){

            return "pavo";

        } else {
            return "indeterminado";
         }
    }
}
