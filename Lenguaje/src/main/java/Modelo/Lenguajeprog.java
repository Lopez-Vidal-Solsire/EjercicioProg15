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
    private String Utilizacion;


    public Lenguajeprog(int AnioCreacion, String CaracteristicaPrin, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrin = CaracteristicaPrin;
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
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

    public String getUtilizacion() {
        return Utilizacion;
    }

    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }

    @Override
    public String toString() {
        return "Lenguajeprog{"
                + "AnioCreacion=" + AnioCreacion + 
                ", CaracteristicaPrin=" + CaracteristicaPrin + 
                ", Nombre=" + Nombre + ", Utilizacion=" +
                Utilizacion + '}';
    }
    
}
