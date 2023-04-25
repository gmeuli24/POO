/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo.rehechos;

import Entidad.Rectangulo;

/**
 *
 * @author Admin
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo figura = new Rectangulo();
       figura.rectan();
        System.out.println("La superficie del rectangulo es "+figura.superficie());
        System.out.println("El perimetro del rectangulo es "+figura.perimetro());
        figura.dibujo();
    }
    
}
