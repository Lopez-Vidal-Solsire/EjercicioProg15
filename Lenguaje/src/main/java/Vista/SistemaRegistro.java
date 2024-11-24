/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.GestionLenguaje;
import Modelo.Lenguajeprog;
import java.util.Scanner;

/**
 *
 * @author SOLSIRE
 */
public class SistemaRegistro {
    private static GestionLenguaje gestionL=new GestionLenguaje();

    public static void main(String[] args) {
        imprimirMenu();
      
    }
       private static void imprimirMenu(){
           int opcion;
          Scanner lector=new Scanner(System.in);
          do{
             String opciones=""" 
              1.Agregar Lenguaje 
             2.Eliminar Lenguaje         
             3.Buscar Lenguaje      
             4.Imprimir Lenguaje     
             5.Salir
             """;
              System.out.println("------Escoge una opci+on------");
                opcion=lector.nextInt();
                lector.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese Nombre");
                    String nombre=lector.nextLine();
                    lector.nextLine();
                    System.out.println(" Ingrese AnioCreacion");
                    int anioCreac=lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese CaracteristicaPrin");
                    String Caraprin=lector.nextLine();
                    lector.nextLine();
                    System.out.println("Ingrese Utilización");
                    String Util=lector.nextLine();
                    lector.nextLine();
                    gestionL.AgregarLenguaje(anioCreac, Caraprin, nombre, Util);
                    break;
                case 2:
                        System.out.println("Ingrese nombre a eliminar:");
                        String nombreelim=lector.nextLine();
                        lector.nextLine();
                        if (gestionL.EliminarLenguaje(nombreelim)) {
                            System.out.println("-Eliminado-");
                    }else{
                              System.out.println("-Lenguaje no encontrado-");
            }
                        break;
                case 3:
                    System.out.println("-Ingrese nombre que desea buscar-:");
                    String Nombrebuscado=lector.nextLine();
                    Lenguajeprog LenguajeBuscado=gestionL.buscarLenguaje(Nombrebuscado);
                    if (LenguajeBuscado!=null) {
                        System.out.println(LenguajeBuscado+" encontrado.");
                    }else{
                        System.out.println("No se encontro ese lenguaje.");
                    }
                    break;
                case 4:
                    gestionL.ImprimirLenguaje();
                    break;
          }
       }
       
       