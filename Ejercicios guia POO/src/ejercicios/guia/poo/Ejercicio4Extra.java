/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.poo;

import Entidad.Cocina;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio4Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas Recetas desea agregar");
    int n=leer.nextInt();
        String [] recetario=new String[n];
        String [] ingredientes=new String[n];
   Cocina cocinar =new Cocina();
   
  recetario[n]=cocinar.agregaReceta();
 cocinar.buscaReceta(recetario, ingredientes, n);
  
    }
    
}
