/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablero_Juego;

/**
 *
 * @author Adrian Regidor
 */
public class Celda {
    private boolean celda;

    public Celda() {
    }

    public boolean getCelda() {
        return celda;
    }

    public void setCelda(boolean celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "Celda{" + "celda=" + celda + '}';
    }
}
