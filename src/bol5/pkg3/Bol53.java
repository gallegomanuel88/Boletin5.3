package bol5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol53 {
    public static void main(String[] args) {
        Circulo obj1 = new Circulo ();
        String respuesta1 = JOptionPane.showInputDialog("Radio: ");
        obj1.radio(Double.parseDouble(respuesta1));
        
        JOptionPane.showMessageDialog(null, "Area= "+obj1.getArea());
        JOptionPane.showMessageDialog(null, "Longitud= "+obj1.getLongitud());
    }
    
}
