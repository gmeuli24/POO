/*
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona [Hombre (H); Mujer (M) ; Otro (O)]: ");
        String sexo = leer.next();
        sexo = sexo.toUpperCase();
        while (!(sexo.equals("M") || sexo.equals("H") || sexo.equals("O"))) {

            System.out.println("Opcion no válida, intente nuevamente.");
            sexo = leer.next();
        }
        System.out.println("Ingrese peso de la persona: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese altura de la persona: ");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Persona sujeto) {
        return sujeto.getEdad() >= 18;
    }

    public int calcularIMC(Persona sujeto) {
        int rta;
        double imc = sujeto.getPeso() / Math.pow(sujeto.getAltura(), 2);
        if (imc < 20) {
            rta = -1;
        } else {
            if (imc <= 25) {
                rta = 0;
            } else {
                rta = 1;
            }
        }
        return rta;
    }

}
    

