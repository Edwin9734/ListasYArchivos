
package com.edwin.interfacesvendedores;
import java.util.Scanner;


public class InterfacesVendedores {
private static final   Scanner scanner = new Scanner (System.in);
private static final String nombreArchivo = "C:\\Users\\Usuario\\Documents\\Progra2\\vasss\\res.txt";
private static int opcion = -1; 

public static void main(String[] args) {
 ClsVendedores catalogoVendedores = new ClsVendedores();
 
 
        while (opcion != 0) {
            try {
     System.out.println("Elige opcion:\n1.- Ver la lista de vendedores"
                        + "\n2.- Agregar Vendedor\n"     
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

        
                switch (opcion) {
                    case 1: 
                        catalogoVendedores.nombress(nombreArchivo);
                        break;
                    case 2:    
                        System.out.println("Introduce el nombre de una pelicula a agregar:");
                        String nombre = scanner.nextLine();
                         catalogoVendedores.iniciarArchivo(nombre,nombreArchivo);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }

 }
    
