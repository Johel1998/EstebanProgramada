package Interfaz_Grafica;

import javax.swing.JOptionPane;
import Logica_Juego.Juego;
import Modelo.Error;
/**
 *
 * @author Esteban M. Peralta
 */
public class Menu {
      
    Juego j = new Juego();
    private boolean continuar = true;
    private int opcion;
    
    public void iniciarMenu() throws Error {
     
        JOptionPane.showMessageDialog(null, "Bienvenidos al Guerra de Peones");
        JOptionPane.showMessageDialog(null, "Este es su tablero");
        //System.out.println(j.imprimir());
        while (continuar) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1 para mover pieza\n2 para salir"));
            switch (opcion) {
                case 1:
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila del peon a seleccionar"));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna del peon a seleccionar"));
                    int filaMover = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila a la que quiere mover el peon"));
                    int columnaMover = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna a la que quiere mover el peon"));
                    j.movimiento(fila, columna, filaMover, columnaMover);
                    System.out.println(j.imprimir());
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
