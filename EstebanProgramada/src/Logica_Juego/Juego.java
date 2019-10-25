package Logica_Juego;

import Modelo.Peones;
import Modelo.Tablero;

/**
 *
 * @author Esteban M. Peralta
 */

public class Juego {
  
    private Peones[][] matrix1;
    private Peones[][] matrix2;
    final static private int SIZE = 8;
    
    
    //Constructor
    public Juego() {
        if (matrix1 == null) {
            matrix1 = new Peones[SIZE][SIZE];
            matrix2 = new Peones[SIZE][SIZE];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1.length; j++) {
                    matrix1[i][j] = new Peones(0);
                }
            }
        }
        if (matrix2 == null) {
            matrix2 = new Peones[SIZE][SIZE];
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    matrix2[i][j] = new Peones(0);
                }
            }
        }
    }
    
    /**
     * Metodo que contiene toda la logica del jogo
     */
    public void logicaJuego(){
        //Contador para blancas
        int contBlancas = 0;
        //Contador para negras
        int contNegras = 0;
        
        
      //Setear fila 2 como blancas, es decir, q sean un 2
//        if (matrix1[2][0] == 0) {
//            
//        }
        //for (int i = 0; i < matrix1.length; i++) {
          //  for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[1][0].getColor() == 0) {
                  contBlancas++;
                }
            //}
        //}
        
      //Setear fila 7 como negra, es decir, q sea 1
        
      
      //Mover una pieza, y q esa pieza sea una blanca inicalmente  
      
      
        
    }
    
//    public void asignacionInicial(){
//  
//    }
    
    
    public String imprimir() {
        String txt = "";
        String[][] matrixAux = new String[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j].getColor() == 0) {
                    matrixAux[i][j] = " 0 ";
                  
                }
                if (matrix1[i][j].getColor() == 1) {
                    matrixAux[i][j] = "  N  ";
                }
                if (matrix1[i][j].getColor() == 2) {
                    matrixAux[i][j] = "  B  ";
                }
                txt = txt + "" + matrixAux[i][j] + "";
            }
            txt = txt + "\n";
        }
        return txt;
    }
    
    
    public static void main(String[] args) {
//        Tablero t = new Tablero();
        Juego j = new Juego();
        j.logicaJuego();
        System.out.println(j.imprimir());
    }
    
    
}
