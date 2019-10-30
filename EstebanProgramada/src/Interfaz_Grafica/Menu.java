package Interfaz_Grafica;

import javax.swing.JOptionPane;
import Logica_Juego.Juego;
/**
 *
 * @author Esteban M. Peralta
 */
public class Menu {
    Juego j = new Juego();
    private boolean continuar = true;
    private int opcion;
    
    public void iniciarMenu() {
        JOptionPane.showMessageDialog(null, "Bienvenidos al Guerra de Peones");
        while (continuar) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1 mover pieza \n 2 para salir"));
            switch (opcion) {
                case 1:
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila del peon a seleccionar"));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna del peon a seleccionar"));
                    int filaMover = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila a la que quiere mover el peon"));
                    int columnaMover = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna a la que quiere mover el peon"));
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "djhfj", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            }   
        }
    }
}