/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.poo;

import Entidad.Cuenta;

/**
 *
 * @author Admin
 */
public class Ejercicio5ExtraCuentabancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cuenta banco=new Cuenta();
      banco.registro();
      banco.validacion();
      banco.IngresaDinero();
      banco.retirar_Dinero();
    }
    
}
