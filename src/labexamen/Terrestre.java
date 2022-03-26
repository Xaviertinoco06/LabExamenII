
package labexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author xavie
 */
public class Terrestre extends Planetas {
    public Terrestre(double tamano, double peso, String nombre, double x, double y) {
        super(tamano, peso, nombre, x, y);
        
        
    }
    public Planetas colision(String nombre, Planetas planeta2) {
        if(porsentaje(25)){
            String nombreNuevo = JOptionPane.showInputDialog(null, "Ponle Nombre");
            double peson = (this.peso + planeta2.peso)/2;
            double tamanon = (this.tamano + planeta2.tamano)/2;
            double xn = (this.x + planeta2.x)/2;
            double yn = (this.y + planeta2.y)/2;
            return new Terrestre(tamanon,peson,nombre,xn,yn);
        }else{
            return null;
        }
    }
}

