/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**Declaracion de la clase Negras
 * @author Esteban M. Peralta
 * @version 03/11/2019
 */ 

public class Negras {
    private int negra;

    public Negras() {
        this.negra = 1;
    }

    public Negras(int negra) {
        this.negra = negra;
    }

    public int getNegra() {
        return negra;
    }

    public void setNegra(int negra) {
        this.negra = negra;
    }

    @Override
    public String toString() {
        return "Negras{" + "negra=" + negra + '}';
    }
    
    
}
