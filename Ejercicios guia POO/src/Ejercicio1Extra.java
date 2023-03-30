
import Entidad.Cancion;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cancion musica=new Cancion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la cancion y el autor ");
        String can=leer.nextLine();
        String aut=leer.nextLine();
        musica.setAutor(aut);
        musica.setTitulo(can);
        System.out.println("El nombre del autor es: "+ musica.getAutor()+"\n El tema se llama: "+ musica.getTitulo());
        
        
        
            
    }
    
}
