/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.components;

import tecnara.java.usuarios.ifaces.IAutenticable;

/**
 *
 * @author marco
 */
public class AuthenticateComponent {
    public static void doAuthentication(IAutenticable autenticable){
        System.out.println(autenticable.autenticarSuperUsuario());
    }
}
