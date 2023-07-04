/*
 Búsqueda Binaria
 */
package video94;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Video94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5};
        int dato,inf,sup,mitad,i;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        
        // Busqueda Binaria 
        inf = 0;
        sup = 5;
        i = 0;
        
        mitad = (inf+sup)/2;
        while (inf <=sup && i<5){
            if (arreglo[mitad] == dato){
                band = true;
                break;
            }
            if (arreglo[mitad] > dato){
                sup = mitad;
                mitad = (inf+sup)/2;
            }
            i++;
        }
        
        if (band == true){
            JOptionPane.showMessageDialog(null,"El numero ha sido encontrado en la posicion: "+mitad);
       }
       else {
           JOptionPane.showMessageDialog(null,"No hemos encontrado la posicion en el arreglo");
        }
    }
    
}
