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
public class Pastel extends Postre implements ManejadorDePrecios {
    static double precioParcial=15.55;
   
    public Pastel(String sabor){
        super(sabor, precioParcial);
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
}
