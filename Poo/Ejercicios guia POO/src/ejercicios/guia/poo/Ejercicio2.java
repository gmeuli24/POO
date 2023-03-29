
package ejercicios.guia.poo;

import Entidad.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {

   public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        for (int i = 0; i < 3; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Intrduzca un radio ");
            System.out.println(circulo.crearCircunferencia(leer.nextInt(), circulo));
            System.out.println("El area de un circulo con ese radio es: " + circulo.getArea());
            System.out.println("El perimetro de un circulo con ese radio es: " + circulo.getPerimetro());
        }
    }
