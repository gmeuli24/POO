/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package Entidad;

import java.util.Scanner;

public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    Scanner leer = new Scanner(System.in);
    public void ingresaEmpleado(){
        System.out.println("Ingrese el nombre del empleado");
        this.nombre=leer.nextLine();
        System.out.println("Ingrese la edad de "+this.nombre);
        this.edad=leer.nextInt();
        System.out.println("Ingrese el salario actual de "+this.nombre);
        this.salario=leer.nextDouble();
        
    }    
    public void calcular_aumento(){
        if (this.edad>30) {
            System.out.println("Al empleado "+this.nombre+" le corresponde 10% de aumento");
            System.out.println("Su salario actual es $ "+this.salario+ " y con el aumento quedaria ");
            this.salario*=1.1;
            System.out.println("$ "+this.salario);
                    
        }else{
            System.out.println("Al empleado "+this.nombre+" le corresponde 5% de aumento");      
            System.out.println("Su salario actual es $ "+this.salario+ " y con el aumento quedaria ");
            this.salario*=1.05;
            System.out.println("$ "+this.salario);
        
    }
    }
}
