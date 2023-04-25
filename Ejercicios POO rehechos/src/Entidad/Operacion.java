/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Operacion {
    private int numero1;
    private int numero2;
    Scanner leer = new Scanner(System.in);
    private int setNumero1;
    private int setNumero2;
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(){
        System.out.println("Ingrese 1er numero");
        this.setNumero1=leer.nextInt();
        System.out.println("Ingrese el 2do numero");
        this.setNumero2=leer.nextInt();
        
        
    }
    public int sumar(){
      int suma=this.setNumero1+this.setNumero2;
       return suma;
    }
 public int restar(){
      int resta=this.setNumero1-this.setNumero2;
       return resta;
    }    
 public int multiplicar(){
     int multi;
     if (this.setNumero1==0 || this.setNumero2==0) {
         System.out.println("Multiplicacion X 0 el resultado siempre es 0");
        return 0;
     }else{
         System.out.println("el resultado de la multiplicacion es "+(multi=this.setNumero1*this.setNumero2));
        
     }
        return multi;   
 }
 public int dividir(){
     int divi;
     if (this.setNumero1==0 || this.setNumero2==0) {
         System.out.println("Division X 0 el resultado siempre es 0");
        return 0;
     }else{
         System.out.println("el resultado de la division es "+(multi=this.setNumero1/this.setNumero2));
        
     }
        return divi;   
 }
    
}
