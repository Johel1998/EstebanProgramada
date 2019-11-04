package Logica_Juego;

import Modelo.Error;
import Modelo.Peones;

/**Declaracion de la clase Juego
 * @author Esteban M. Peralta
 * @version 03/11/2019
 */
public class Juego {

    //BLANCAS == 2 && NEGRAS == 1
    private Peones[][] matrix1;
    private Peones[][] matrix2;
    final static private int SIZE = 8;
    private boolean turnoBlancas = true;
    private int contadorB = 0;
    private int contadorN = 0;
    boolean mover2espacios = true;

    //Constructor
    /*Creacion de constructor Juego
    @param 
    
    /** Creacion del constructor juego
    
    */
    public Juego() {
        if (matrix1 == null) {
            matrix1 = new Peones[SIZE][SIZE];
            matrix2 = new Peones[SIZE][SIZE];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1.length; j++) {
                    matrix1[i][j] = new Peones(0);//Vacio
                }
            }
            for (int i = 0; i < matrix1[1].length; i++) {
                matrix1[1][i] = new Peones(1);//Negras
                matrix1[6][i] = new Peones(2);//Blancas
//                  matrix1[1][i].setColor(1);
//                  matrix2[6][i].setColor(2);
            }
        }
//        if (matrix2 == null) {
//            matrix2 = new Peones[SIZE][SIZE];
//            for (int i = 0; i < matrix2.length; i++) {
//                for (int j = 0; j < matrix2.length; j++) {
//                    matrix2[i][j] = new Peones(0);
//                }
//            }
//        }
    }

    public void setPosicion (int fila, int columna){
        matrix1[fila][columna].setColor(1);
    }
    
    /**
     *
     */
    public void cambiarTurno() {
        if (turnoBlancas == true) {
            turnoBlancas = false;
        } else {
            turnoBlancas = true;
        }
    }

    /**
     * Valida
     *
     * @param fila define las filas de la matriz, o en este caso el tablero
     * @param columna define las columnas de la matriz, o en este caso el tablero
     * @return booleano true o false segun movimiento
     */
    public boolean esPiezaInicial(int fila, int columna) {
        if ((fila == 6 && matrix1[fila][columna].getColor() == 2 && turnoBlancas == true)
                || fila == 1 && matrix1[fila][columna].getColor() == 1 && turnoBlancas == false) {
            mover2espacios = true;
            return true;
        }
        mover2espacios = false;
        return false;
    }
    
    /**
     * Metodo que valida que mueva 1 o 2 espacios en blancas o negras
     * @param fila
     * @param columna
     * @param filaMover
     * @param columnaMover
     * @return booleano true o false segun movimiento
     */
        public boolean sePuedeComer(int fila, int columna, int filaMover, int columnaMover) {
        if (turnoBlancas) {
            if ((matrix1[filaMover][columnaMover].getColor() == 2 && filaMover == 2) && 
                    (columnaMover == columna++ || columnaMover == columna--)) {
                return true;
            }
        } else if ((matrix1[filaMover][columnaMover].getColor() == 1 && filaMover == 2) && (columnaMover == columna++ || columnaMover == columna--)) {
            return true;
        }
        return false;
    }

    public void movimiento(int fila, int columna, int filaMover, int columnaMover){
        if (sePuedeComer(fila, columna, filaMover, columnaMover) == true) {
            if (turnoBlancas) {
                matrix1[fila][columna].setColor(0);
                matrix1[filaMover][columnaMover].setColor(2);
            } else {
                matrix1[fila][columna] = new Peones(0);
                matrix1[filaMover][columnaMover] = new Peones(1);
            }
            cambiarTurno();
            return;
        }
        if (esPiezaInicial(fila, columna)) { //verifica si puede mover 2 espacios adelante
            if (filaMover == fila + 2 || filaMover == fila++) {//verifica que donde se quiera mover sea valido
                if (turnoBlancas) {
                    matrix1[fila][columna] = new Peones(0);
                    matrix1[filaMover][columnaMover] = new Peones(2);
                } else {
                    matrix1[fila][columna] = new Peones(0);
                    matrix1[filaMover][columnaMover] = new Peones(1);
                }
            }
            cambiarTurno();
            return;
        }
        if (filaMover == fila++) { //verifica que donde se quiera mover sea valido
            if (turnoBlancas) {
//                matrix1[fila][columna] = new Peones(0);
//                matrix1[filaMover][columnaMover] = new Peones(2);
                 matrix1[fila][columna].setColor(0);
                 matrix1[filaMover][columnaMover].setColor(2);
            } else {
//                matrix1[fila][columna] = new Peones(0);
//                matrix1[filaMover][columnaMover] = new Peones(1);
                 matrix1[fila][columna].setColor(0);
                 matrix1[filaMover][columnaMover].setColor(1);
            }
            cambiarTurno();
            return;
        }
       // System.out.println("nel");
    }
    
    public String imprimir() {
        String txt = "";
        String[][] matrixAux = new String[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j].getColor() == 0) {
                    matrixAux[i][j] = " 0 ";
                }
                if (matrix1[i][j].getColor() == 1) {
                    matrixAux[i][j] = " N ";
                }
                if (matrix1[i][j].getColor() == 2) {
                    matrixAux[i][j] = " B ";
                }
                txt = txt + "" + matrixAux[i][j] + "";
            }
            txt = txt + "\n";
        }
        return txt;
    }
    
    public String imprimir2(){
        String txt = "";
        String[][] matrixAux;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j].getColor() == 0) {
                    txt += " 0 ";
                }
                if (matrix1[i][j].getColor() == 1) {
                    txt += " N ";
                }
                if (matrix1[i][j].getColor() == 2) {
                    txt += " B ";
                }
            }
            txt = txt + "\n";
        }
        return txt;
    }

    public static void main(String[] args) throws Error {
        Juego j = new Juego();
        //System.out.println(j.imprimir2());
       // j.movimiento(6, 0, 4, 0);
//        System.out.println(j.imprimir2());
//        j.movimiento(4, 0, 6, 0);
//        System.out.println(j.imprimir2());
//        j.setPosicion(4, 0);
    
        //j.cambiarTurno();
         
        
        
       
        System.out.println(j.sePuedeComer(1, 0, 2, 0));
    }
}
