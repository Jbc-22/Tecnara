/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnara.java.usuarios.tipos;

import tecnara.java.usuarios.ifaces.IMamifero;

/**
 *
 * @author marco
 */
public class Usuario implements IMamifero{
    
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;
    private String tipoDeUsuario;
    
    public Usuario(String nombre, String apellido, int telefono, String mail, String tipoDeUsuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.tipoDeUsuario = tipoDeUsuario;
    }
    
    public String welcomeMessage(){
        return "Bienvenido "+this.nombre + " " + this.apellido + " eres " + this.tipoDeUsuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the tipoDeUsuario
     */
    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    /**
     * @param tipoDeUsuario the tipoDeUsuario to set
     */
    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    @Override
    public String mamar() {
        return "Me estoy tomando un biberon";
    }
    
}
