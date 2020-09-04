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
public class UsuarioExterno extends Usuario {
    private String companyId;
    private String companyName;
    

    public UsuarioExterno(String nombre, String apellido, int telefono, String mail, String companyId, String companyName) {
        super(nombre, apellido, telefono, mail, "Externo");
        this.companyId = companyId;
        this.companyName = companyName;
        
    }

    /**
     * @return the companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId the companyId to set
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
