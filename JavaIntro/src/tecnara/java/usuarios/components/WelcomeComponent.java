/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.components;

import tecnara.java.usuarios.tipos.Usuario;

/**
 *
 * @author marco
 */
public class WelcomeComponent {
    public static void showWelcomeMessage(Usuario user){
        System.out.println(user.welcomeMessage());
    }
}
