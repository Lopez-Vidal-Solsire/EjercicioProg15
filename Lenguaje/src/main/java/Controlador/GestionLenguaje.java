/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controlador;

import Modelo.Lenguajeprog;




/**
 *
 * @author SOLSIRE
 */
public class GestionLenguaje {
    private static final int FACTOR_CRECIMIENTO=2;
    private static int contadorLenguajes=0;
    private static Lenguajeprog[] ArregloLenguajes=new Lenguajeprog[FACTOR_CRECIMIENTO];
        
    
    //Método AgregarLenguaje
    public void AgregarLenguaje( int AnioCreacion, String CaracteristicaPrin,String Nombre,String Utilizacion){
            if (contadorLenguajes>=ArregloLenguajes.length){
        Lenguajeprog[] ArrFaCrec=new Lenguajeprog[ArregloLenguajes.length+FACTOR_CRECIMIENTO];   
        System.arraycopy(ArregloLenguajes,0,ArrFaCrec,0,ArregloLenguajes.length);
        ArregloLenguajes=ArrFaCrec;
        }else{
                ArregloLenguajes[contadorLenguajes]=new Lenguajeprog(AnioCreacion, CaracteristicaPrin, Nombre, Utilizacion);
                contadorLenguajes++;
            }
    }
    //Método BuscarLenguaje

    
    public static Lenguajeprog buscarLenguaje(String Nombre){
        for (int i = 0; i < contadorLenguajes; i++) {
            //Busca coincidencia y nos retorna
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null;
    }
    //Método EliminarLenguaje
        public boolean EliminarLenguaje (String Nombre){
        for (int i = 0; i < contadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                //Coincide  
                for (int j = i ; j < contadorLenguajes; j++) {
                    ArregloLenguajes[j]=ArregloLenguajes[j++];
                }
                ArregloLenguajes[contadorLenguajes--]=null;
                return true;
        }
}
    return false;
    }

        //Método ImprimirLenguaje
public void ImprimirLenguaje(){
    for (int i = 0; i < contadorLenguajes; i++) {
        if (contadorLenguajes>0) {
         System.out.println(ArregloLenguajes[i].toString());
    }else{
            System.out.println("no hay lenguajes");
        }
}    
}
}
