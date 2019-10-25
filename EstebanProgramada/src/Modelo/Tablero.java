package Modelo;

/**
 *
 * @author Esteban M. Peralta
 */
public class Tablero {
    private Peones [][] matrix1;
    private Peones [][] matrix2;
    final static private int SIZE = 8;
    
    public Tablero(Peones[][] matrix){//ESTO NO ES NECESARIO X Q UD NO VA RECIBIR UNA MATRIX POR EL USER
        this.matrix1 = matrix;
        this.matrix2 = matrix;
    }
    public Tablero(){
        if(matrix1 == null){
           matrix1 = new Peones[SIZE][SIZE];
        }
    }
}
