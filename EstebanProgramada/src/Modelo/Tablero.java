/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Esteban M. Peralta
 */
public class Tablero {
    private Peones [][] matrix1;
    private Peones [][] matrix2;
    final static private int SIZE = 8;
    
    public Tablero(Peones[][] matrix){
        this.matrix1 = matrix;
        this.matrix2 = matrix;
    }
    public Tablero(){
        if(matrix1 == null){
           matrix1 = new Peones[SIZE][SIZE];
        }
    }
}
