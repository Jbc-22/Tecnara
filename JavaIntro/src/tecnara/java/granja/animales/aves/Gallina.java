package tecnara.java.granja.animales.aves;

import tecnara.java.granja.ifaces.Pastoreable;


public class Gallina extends Ave implements Pastoreable{

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void pastorear() {
        System.out.println("Soy una gallina, me llamo "+this.getNombre() + " y me están pastoreando");
    }


}
