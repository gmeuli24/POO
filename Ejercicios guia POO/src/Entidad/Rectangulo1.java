/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package Entidad;

import java.util.Scanner;


public class Rectangulo1 {
    public int lado1;
    public int lado2;
    Scanner leer = new Scanner(System.in);
    public int calcular_area(){
        int area;
        System.out.println("Ingrese el valor para el alto");
        this.lado1=leer.nextInt();
        System.out.println("Ingrese el valor para el ancho");
        this.lado2=leer.nextInt();
        area=this.lado1*this.lado2;
        return area;
        
    }
    public void rectangulo2(int a, int b){
        int area;
        System.out.println("El area del 2°do. rectangulo es ");
        area=a*b;
        System.out.println(area);
    }
    
}
