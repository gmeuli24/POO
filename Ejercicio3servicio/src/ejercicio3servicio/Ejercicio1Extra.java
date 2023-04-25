package ejercicio3servicio;

import Entidades.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        
        RaicesServicio raicesServicio = new RaicesServicio();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los valores de a, b, c:");
        Raices raices1 = new Raices(leer.nextDouble(),leer.nextDouble(),leer.nextDouble());
        
        raicesServicio.calcular(raices1);
        
    }
    
}
