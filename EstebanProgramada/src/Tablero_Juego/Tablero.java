/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero_Juego;

/**
 *
 * @author Esteban M. Peralta
 */
public class Tablero {
    private Celda [][] matrix1;
    private Celda [][] matrix2;
    final static private int SIZE = 8;
    
    public Tablero(Celda[][] matrix){
        this.matrix1 = matrix;
        this.matrix2 = matrix;
    }
    public Tablero(){
        if(matrix1 == null){
           matrix1 = new Celda[SIZE][SIZE];
        }
    }
}
