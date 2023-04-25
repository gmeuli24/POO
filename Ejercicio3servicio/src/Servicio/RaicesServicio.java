/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;

/**
 *
 * @author Admin
 */
public class RaicesServicio {


    public double getDiscriminante(Raices raices) {
        return (Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC()));
        //(b^2)-4*a*c
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            System.out.println("Primera solución: " + ((-raices.getB() + Math.sqrt(Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC()))) / (2 * raices.getA())));
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            System.out.println("Segunda solución: " + ((-raices.getB() - Math.sqrt(Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC()))) / (2 * raices.getA())));
        }
    }

    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            System.out.println("Solución: " + (-raices.getB() / (2 * raices.getA())));
        }
    }

    public void calcular(Raices raices) {
        
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        }else if(tieneRaiz(raices)){
            obtenerRaiz(raices);
        }else{
            System.out.println("No tiene solución.");
        }
        
    }
}
