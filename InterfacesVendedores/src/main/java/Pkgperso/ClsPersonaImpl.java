 
package Pkgperso; 
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
public class ClsPersonaImpl implements IPersona{
 
    @Override
    public String getNombre(String nombre) {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void llenar_informacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Cargar_información(String nombreArchivo) {
         PrintWriter salida =null;
        try{
            File archivo =new File( nombreArchivo);
            salida = new PrintWriter( new FileWriter(nombreArchivo));
            salida.close();
        }catch(IOException ex){
            System.out.println("error");
             
        }
    }

    @Override
    public void guardar_información(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
