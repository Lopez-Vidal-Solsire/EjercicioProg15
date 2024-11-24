/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SOLSIRE
 */
public class Lenguajeprog {
    private int AnioCreacion;
    private String CaracteristicaPrin;
    private String Nombre;
    private String Utilización;


    public Lenguajeprog(int AnioCreacion, String CaracteristicaPrin, String Nombre, String Utilización) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrin = CaracteristicaPrin;
        this.Nombre = Nombre;
        this.Utilización = Utilización;
    }

    
    public int getAnioCreacion() {
        return AnioCreacion;
    }

    public void setAnioCreacion(int AnioCreacion) {
        this.AnioCreacion = AnioCreacion;
    }

    public String getCaracteristicaPrin() {
        return CaracteristicaPrin;
    }

    public void setCaracteristicaPrin(String CaracteristicaPrin) {
        this.CaracteristicaPrin = CaracteristicaPrin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUtilización() {
        return Utilización;
    }

    public void setUtilización(String Utilización) {
        this.Utilización = Utilización;
    }

    @Override
    public String toString() {
        return "Lenguajeprog{" + "AnioCreacion=" + AnioCreacion + ", CaracteristicaPrin=" + CaracteristicaPrin + ", Nombre=" + Nombre + ", Utilizaci\u00f3n=" + Utilización + '}';
    }
    
}
