/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;


public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;
    private int setBase;
    private int setAltura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void rectan(){
        System.out.println("Ingrese el valor para la base del rectangulo");
        this.setBase=leer.nextInt();
        System.out.println("Ingrese el valor para la altura del rectangulo");
        this.setAltura=leer.nextInt();
        System.out.println("El rectangulo es de "+this.setBase+ " cm x "+this.setAltura+" cm de alto");
    }
    public double superficie(){
        double sup;
        sup=this.setBase*this.setAltura;
        return sup;
    }
    public double perimetro(){
        double per;
                per=(this.setBase+this.setAltura)*2;
                return per;
    }
    public void dibujo() {
        for (int i = 0; i < this.setBase; i++) {
            for (int j = 0; j < this.setAltura; j++) {
                if(i==0 || i==this.setBase-1 || j==0 || j== this.setAltura-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
    }
            
    

