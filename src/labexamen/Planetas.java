
package labexamen;

import java.io.Serializable;
import java.util.Random;

public abstract class Planetas implements Serializable {
    
    static Random r = new Random();
  
    protected double tamaño;
    protected double peso;
    protected String nombre;
    protected double x;
    protected double y;

    public Planetas(double tamaño, double peso, String nombre, double x, double y) {
        this.tamaño = tamaño;
        this.peso = peso;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public static Random getR() {
        return r;
    }

    public static void setR(Random r) {
        Planetas.r = r;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    

    
     public boolean probabilidad(int porcentaje){
        int num = r.nextInt(100);
        return num<=porcentaje;
    }
     public abstract Planetas explotacion(Planetas planeta2);
    
    
}
