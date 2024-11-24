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
    private int contadorLenguajes=0;
    private Lenguajeprog[] ArregloLenguajes=new Lenguajeprog[FACTOR_CRECIMIENTO];
    
    public void AgregarLenguaje( int AnioCreacion, String CaracteristicaPrin,String Nombre,String Utilización){
            if (contadorLenguajes>=ArregloLenguajes.length){
        Lenguajeprog[] ArrFaCrec=new Lenguajeprog[ArregloLenguajes.length+FACTOR_CRECIMIENTO];   
        System.arraycopy(ArregloLenguajes,0,ArrFaCrec,0,ArregloLenguajes.length);
        ArregloLenguajes=ArrFaCrec;
        }else{
                ArregloLenguajes[contadorLenguajes]=new Lenguajeprog(AnioCreacion, CaracteristicaPrin, Nombre, Utilización);
                contadorLenguajes++;
            }
        }
        
    public Lenguajeprog buscarLenguaje(String Nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null;
    }
        public boolean EliminarLenguaje (String Nombre){
        for (int i = 0; i < contadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                System.arraycopy(ArregloLenguajes, i + 1, ArregloLenguajes, i, contadorLenguajes - i - 1);
                contadorLenguajes--;
                return true;
        }
}
    return false;
    }

    @Override
    public String toString() {
        return "GestionLenguaje{" + "ArregloLenguajes=" + ArregloLenguajes + '}';
    }
        
public void ImprimirLenguaje(){
    for (int i = 0; i < contadorLenguajes; i++) {
        System.out.println(ArregloLenguajes[i].toString());
    }
}    
}