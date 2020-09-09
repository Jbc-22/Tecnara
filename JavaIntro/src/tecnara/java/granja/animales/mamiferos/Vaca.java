package tecnara.java.granja.animales.mamiferos;

import tecnara.java.granja.ifaces.Pastoreable;

public class Vaca extends Mamifero implements Pastoreable {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void pastorear() {
        System.out.println("Soy una vaca, me llamo " + this.getNombre() + " y me están pastoreando");
    }
}
