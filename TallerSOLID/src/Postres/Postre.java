package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

public abstract class Postre{
            protected String sabor;
	    protected ArrayList<Aderezo> aderezos;
            double precioParcial;
	    
	    public Postre(String sabor, double precioParcial){
	        aderezos= new ArrayList<>();
	        this.sabor=sabor;
                this.precioParcial=precioParcial;
	    }
	    public void addAderezos(Aderezo aderezo) {
	        aderezos.add(aderezo);
	    }
            public void quitarAderezo(Aderezo aderezo){
                aderezos.remove(aderezo);
            
            }
            public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
	    
}