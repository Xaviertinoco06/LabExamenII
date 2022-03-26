package labexamen;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Gaseosos extends Planetas implements Serializable {

    public Gaseosos(double tamaño, double peso, String nombre, double x, double y) {
        super(tamaño, peso, nombre, x, y);
    }
    public Planetas explotacion(Planetas planeta2) {
        if (probabilidad(25)) {
            double peson = (this.peso + planeta2.peso) / 2;
            double tamañon = (this.tamaño + planeta2.tamaño) / 2;
            double xn = (this.x + planeta2.x) / 2;
            double yn = (this.x + planeta2.y) / 2;
            String nombren = JOptionPane.showInputDialog(null, "Ponle nombre");
            return new Gaseosos(tamañon, peson, nombren, xn, yn);
        } else {
            return null;
        }
    }

}
