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
public class Proveedores {
    
//----- Atributos -----
    private String empresa, producto;
    private int telefono;
    
    public Proveedores(){}
    
    //------ Constructor -------
    public Proveedores(String empresa,String producto, int telefono){
        this.empresa = empresa;
        this.producto = producto;
        this.telefono = telefono;
    }
    
    // --- Metodos ---

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
