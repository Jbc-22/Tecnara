/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.main;

import java.util.Base64;
import tecnara.java.usuarios.animales.Raton;
import tecnara.java.usuarios.components.AuthenticateComponent;
import tecnara.java.usuarios.components.WelcomeComponent;
import tecnara.java.usuarios.components.Zoo;
import tecnara.java.usuarios.tipos.UsuarioAdmin;
import tecnara.java.usuarios.tipos.UsuarioBase;

/**
 *
 * @author marco
 */
public class UsuariosMain {
    public static void main(String[] args){
        UsuarioAdmin admin = new UsuarioAdmin("Juan", "Pablo", 897654, "mail@mail.com", "987897asd");
        UsuarioBase base = new UsuarioBase("Juan", "Pablo", 897654, "mail@mail.com");
        WelcomeComponent.showWelcomeMessage(admin);
        AuthenticateComponent.doAuthentication(admin);
        Raton raton = new Raton();
        AuthenticateComponent.doAuthentication(raton);
        Zoo.alimentarMamiferos(admin);
    }
}
