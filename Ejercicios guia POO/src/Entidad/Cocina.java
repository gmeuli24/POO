/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package Entidad;

import java.util.Scanner;


public class Cocina {
    
    public String receta;
    
    
 public String agregaReceta(){
     Scanner leer = new Scanner(System.in);
   
     
     
     String [] recetario=new String[n];
    
     for (int i = 0; i < n; i++) {
         System.out.println("Ingrese el nombre de la receta");
         recetario[i]=leer.next();
         return recetario[n];
     }
 }
 public String agregaIngrediente(){
      String [] ingredientes=new String[n];
     for (int i = 0; i < 2; i++) {
        System.out.println("Ingrese el ingrediente principal de "+(i+1)+ "° esta receta");
         ingredientes[i]=leer.next(); 
         
        
         return recetario[];
     }
     
        
 }   
 public String buscaReceta(String recetario[],String ingredientes[],int n){
     Scanner leer = new Scanner(System.in);
     String recetaoing;
     boolean flag=false;
         System.out.println("Ingrese la receta a buscar o el Ingrediente principal");
         recetaoing=leer.nextLine();
     for (int i = 0; i < n; i++) {
     
         if (recetario[i].equals(recetaoing)) {
             flag=true;
             System.out.println("La Receta se encuentra en el recetario y su ingrediente principal es "+ingredientes[i]);
             break;
             
             
         }else if(ingredientes[i].equals(recetaoing)){
             System.out.println("El ingrediente principal se encuentra en la receta"+recetario[i]);
        
             
         }
         
         
     }
     
 }
}


