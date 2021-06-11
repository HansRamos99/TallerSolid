/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author Hp
 */
public interface ManejadorDePrecio {
    
    static public double calcularPrecioFinal(Postre postre){
        double precioParcial= postre.getPrecioParcial();
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
    static public String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }
    
    
}
