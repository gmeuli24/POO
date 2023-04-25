/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo.rehechos;

import Entidad.Operacion;

/**
 *
 * @author Admin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Operacion op = new Operacion();
      op.crearOperacion();
        System.out.println("El valor de la suma es "+op.sumar());
         System.out.println("El valor de la resta es "+op.restar());
        op.multiplicar();
        op.dividir();
    }
    
    
}
