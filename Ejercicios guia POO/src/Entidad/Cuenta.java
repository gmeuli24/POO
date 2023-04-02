/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cuenta {
    
    public double saldo;
    public String titular;
    public double dni;
    Scanner leer = new Scanner(System.in);  
public void IngresaDinero(){
    do {System.out.println("Ingrese el monto a depositar");
this.saldo=leer.nextInt(); 
        if (this.saldo<=0) {System.out.println("El monto minimo para deposito es $1");
            
        }
    } while (this.saldo<=0);
    
    

}  
public void retirar_Dinero(){
    double retiro;
   do{
    System.out.println("Ingrese el monto a retirar");
    retiro=leer.nextInt();
   
    if (this.saldo<retiro) {System.out.println("El saldo que desea retirar es mayor de lo que dispone");
        System.out.println("Su saldo disponible es $ "+this.saldo);
        
    }else{
        this.saldo-=retiro;
        System.out.println("Su retiro se proceso con exito");
        System.out.println("Su Nuevo saldo es $ "+this.saldo);
        break;
    }
    
}while (this.saldo<retiro);
    
}
public void registro(){
    System.out.println("Para abrir su cuenta ingrese su nombre completo");
    this.titular=leer.nextLine();
    System.out.println("Ingrese su numero de DNI");
    this.dni=leer.nextDouble();
    System.out.println("Su registro se completo con exito");
    System.out.println("Para poder operar debera reingresar sus credenciales");
    
}
public void validacion(){
    String nombre;
    double documento;
    do {
    System.out.println("Ingrese su nombre completo");
    nombre=leer.nextLine();
    nombre=leer.nextLine();
    System.out.println("\n Ingrese su numero de DNI");
    documento=leer.nextDouble();
        if (this.titular.equals(nombre) && this.dni==documento) {
            System.out.println("La validacion se completo con exito");
            System.out.println("Ya puede realizar un deposito");
        }else{
            System.out.println("Los datos ingresados son incorrectos");
        }
            
        }while (this.dni!=documento || !this.titular.equals(nombre));
    
}
}
