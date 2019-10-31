/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Interfaz_Grafica.Menu;
import Modelo.Error;

/**
 *
 * @author Esteban M. Peralta
 */
public class Main {
    public static void main(String[] args) throws Error {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}
