/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Blancas {
    private int blancas;
    
    
    public Blancas() {
        this.blancas = 2;
    }
    
    public Blancas(int blancas) {
        this.blancas = blancas;
    }

    public int getBlancas() {
        return blancas;
    }

    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }

    @Override
    public String toString() {
        return "Blancas{" + "blancas=" + blancas + '}';
    }
    
    
}
