package Postres

public abstract class Postre{
		private String sabor;
	    private ArrayList<Aderezo> aderezos;
	    
	    public Postre(String sabor){
	        aderezos= new ArrayList<>();
	        this.sabor=sabor;
	    }
	    
	    public void addAderezos(Aderezo aderezo) {
	        return aderezos.add(aderezo);
	    }
	    
	    
	
}