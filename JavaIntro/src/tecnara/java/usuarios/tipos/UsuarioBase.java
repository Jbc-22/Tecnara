/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.tipos;

/**
 *
 * @author marco
 */
public class UsuarioBase extends Usuario {
    
    public UsuarioBase(String nombre, String apellido, int telefono, String mail) {
        super(nombre, apellido, telefono, mail, "Base");
    }
    
}
