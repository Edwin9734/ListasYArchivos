
package com.edwin.interfacesvendedores;
import Pkgperso.ClsPersonaImpl;
import Pkgperso.IPersona;
import java.io.BufferedReader;
import java.io.*;  

 
    public class ClsVendedores {
 private String nombre;  
 
    private final IPersona datos;
    public ClsVendedores(){
        this.datos= new ClsPersonaImpl();
    }
    
     
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void nombress(String nombreArchivo){
         File archivo = new File(nombreArchivo);
       try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            
            int NoLinea=1;
            while (lectura != null){
                lectura = datos.getNombre(lectura);
                System.out.println(lectura);
                lectura = entrada.readLine();
                NoLinea++; 
            }
            
            entrada.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
        }
     }
       
    public void iniciarArchivo(String otro,String nombreArchivo) {
        PrintWriter salida = null;
        try{
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter ( new FileWriter(archivo,true));
            File archivos = new File(nombreArchivo);
            salida.println(otro.toString());
            salida.close();
            System.out.println("se ha escrito en el registro de pelicuals");
         }catch(Exception e){
        
         }
    }   
       
       
       
       
     
     
     
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
   
     
    
    
}
