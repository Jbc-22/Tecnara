/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.animales;

import tecnara.java.usuarios.ifaces.IAutenticable;
import tecnara.java.usuarios.ifaces.IMamifero;

/**
 *
 * @author marco
 */
public class Raton implements IAutenticable, IMamifero{
    int númeroPatas;
    
    public void roer(){
        
    }

    @Override
    public String autenticarSuperUsuario() {
        return "Mouse authenticating here!";
    }

    @Override
    public String mamar() {
        return "Estoy bebiendo leche de mi madre la rata!!";
    }
}
