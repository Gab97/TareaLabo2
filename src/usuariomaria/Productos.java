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
public class Productos {
    
    //----- Atributos -----
    private String nombre, precio, proveedor;
    private int cantProd;
    
    public Productos(){}
    
    //------ Constructor -------
    public Productos(String nombre,String precio, String proveedor, int cantProd){
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.cantProd = cantProd;
    }
    
    // --- Metodos ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }
}
