
package com.edwin.interfacesvendedores;
 
public class vendedores {
    private String nombre;
    public vendedores(String nombre_vendedor){
        this.nombre=nombre_vendedor;
        
    }

    @Override
    public String toString() {
        //return "Pelicula{" + "nombre=" + nombre + '}';
        return this.getNombre();
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
