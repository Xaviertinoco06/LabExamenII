/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen;

/**
 *
 * @author xavie
 */
public class Gaseoso extends Planetas {

    public Gaseoso(double tamano, double peso, String nombre, double x, double y) {
        super(tamano, peso, nombre, x, y);
    }
    public Planetas colision(String nombre, Planetas planeta2) {
        if(porsentaje(25)){
            double peson = (this.peso + planeta2.peso)/2;
            double tamanon = (this.tamano + planeta2.tamano)/2;
            double xn = (this.x + planeta2.x)/2;
            double yn = (this.y + planeta2.y)/2;
            return new Gaseoso(tamanon,peson,nombre,xn,yn);
        }else{
            return null;
        }
    }
    }
    



