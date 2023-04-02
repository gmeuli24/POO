/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;


public class Juego {
    
 
    
public void iniciar_juego(){
    String j1,j2;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el nombre del 1er Jugador");
    j1=leer.nextLine();
    System.out.println("Ingrese el nombre del 2do Jugador");
    j2=leer.nextLine();
   System.out.println(j1+" Ingrese su numero");
   int n1=leer.nextInt();
    
    for (int i = 0; i < 3; i++) {
        System.out.println(j2+" Ingrese su numero");
    int adivinanza=leer.nextInt();
    
        if(adivinanza==n1){
            System.out.println("Felicidades "+j2+" Usted adivino");
            break;
        }else if(adivinanza>n1){
            System.out.println("Pruebe con un numero mas bajo");              
            
        }else if(adivinanza<n1){
            System.out.println("Pruebe un numero mas alto");
        }else if(i==3){System.out.println("Mejor suerte para la proxima");
        }
    }
    
    
    
   
    
    
    }    
    
    
}
