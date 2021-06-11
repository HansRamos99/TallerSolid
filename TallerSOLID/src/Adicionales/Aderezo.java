/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    //MALVAVISCOS,FRUTILLA,CREMA
    protected String NombreAderezo;

    abstract void setNombreAderezo(String NombreAderezo);

    @Override
    public String toString() {
        return NombreAderezo.toUpperCase();
    }
}
