/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariomaria;


/**
 *
 * @author soporte
 */
public class Usuario {
    
    //----- Atributos -----
    private String nombreUsuario, contraseña;
    
    public Usuario(){}
    
    //------ Constructor -------
    public Usuario(String nombreUsuario, String contraseña){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
    // --- Metodos ---

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
