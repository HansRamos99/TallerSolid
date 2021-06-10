/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Procesos.ManejadorDePrecios;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre implements ManejadorDePrecios {
    private static double precioParcial = 7.85;
    public Helado(String sabor){
        super(sabor, precioParcial);
    }
   
    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    

    
}
