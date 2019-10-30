package Interfaz_Grafica;

import javax.swing.JOptionPane;
import Logica_Juego.Juego;
/**
 *
 * @author JOHEL
 */
public class Menu {
    Juego j = new Juego();
    private boolean continuar = true;
    private int opcion;
    
    public void iniciarMenu(){
    
        while (continuar) {   
            JOptionPane.showInputDialog("Bienvenidos\n1-Jugar"
                    + "\n2-Salir");
            switch(opcion){
                case 1:
                    
                    String namePlayer1= JOptionPane.showInputDialog("Digite el nombre del jugador 1");
                    String namePlayer2= JOptionPane.showInputDialog("Digite el nombre del jugador 2");
                    
                    
                    int coordenadaFila1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila en la que "
                            + "desea hacer realizar su primer movimiento"));
                    
                    int coordenadaColumn1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna en la que "
                            + "desea hacer realizar su primer movimiento"));
                    
                    
                    j.escogerPiezaInicial(coordenadaFila1, coordenadaColumn1);
                    
                    break;
                    
                case 2:
                    continuar = false;
                    break;
                
            }
            
        }
        
        
    
    }

    
}
