/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author xavie
 */
public class Planetas {
    protected Random r = new Random();
    protected String nombre;
    protected double tamano;
    protected double peso;
    protected double x;
    protected double y;

        public Planetas( double tamano, double peso,String nombre,double x, double y) {
            this.nombre = nombre;
            this.tamano = tamano;
            this.peso = peso;
            this.x = x;
            this.y = y;
        }

        public Random getR() {
            return r;
        }

        public void setR(Random r) {
            this.r = r;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getTamano() {
            return tamano;
        }

        public void setTamano(double tamano) {
            this.tamano = tamano;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
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
        

    
}
    
    

