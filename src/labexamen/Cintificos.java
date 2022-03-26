package labexamen;

import java.io.Serializable;
import java.util.ArrayList;

public class Cintificos implements Serializable {

    protected String nombreCientifico;
    ArrayList<Planetas> planetas;

    public Cintificos(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
        planetas = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public ArrayList<Planetas> getListaPlanetas() {
        return planetas;
    }

    public void setListaPlanetas(ArrayList<Planetas> listaPlanetas) {
        this.planetas = listaPlanetas;
    }

}
