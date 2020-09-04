/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.tipos;

import java.util.Base64;
import tecnara.java.usuarios.ifaces.IAutenticable;

/**
 *
 * @author marco
 */
public class UsuarioSistema extends Usuario implements IAutenticable{

    private String goldenKey;

    public UsuarioSistema(String nombre, String apellido, int telefono, String mail, String goldenKey) {
        super(nombre, apellido, telefono, mail, "Sistema");
        this.goldenKey = goldenKey;
    }

    /**
     * @return the goldenKey
     */
    public String getGoldenKey() {
        return goldenKey;
    }

    /**
     * @param goldenKey the goldenKey to set
     */
    public void setGoldenKey(String goldenKey) {
        this.goldenKey = goldenKey;
    }

    @Override
    public String autenticarSuperUsuario() {
        return Base64.getEncoder().encodeToString(("Bearer "+this.goldenKey).getBytes());
    }
}
