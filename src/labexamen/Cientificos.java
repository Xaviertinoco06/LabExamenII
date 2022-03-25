/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen;

import java.util.ArrayList;

/**
 *
 * @author xavie
 */
public class Cientificos {
    protected ArrayList<Planetas> planetas;
     protected String nombreC;

    public Cientificos(ArrayList<Planetas> planetas, String nombre) {
        this.planetas = planetas;
        this.nombreC = nombreC;
    }

    public ArrayList<Planetas> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planetas> planetas) {
        this.planetas = planetas;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

  

    @Override
    public String toString() {
        return "Cientificos{" + "planetas=" + planetas + ", nombre=" + nombreC+ '}';
    }
    
}
