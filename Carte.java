public class Carte {
    private NumeroCarte numero;

    private TypCarte type;

    private int poids;
    
    private LocalisationCarte localisation;
    
    public Carte(NumeroCarte num, TypCarte typ) {
    	this.poids=5;
    	this.numero=num;
    	this.type=typ;
    	this.localisation=LocalisationCarte.Pioche;
    }
    
    public Carte(NumeroCarte num, TypCarte typ, int poids) {
    	this.numero=num;
    	this.type=typ;
    	this.poids=poids;
    	this.localisation=LocalisationCarte.Pioche;
    }
    
    public String toString(){
    	String s;
    	s="["+this.getType()+","+this.getNumero()+"]";
    	return s;
    }

    protected void finalize() {
    }

    public void appliquerPouvoir() {
    }

    NumeroCarte getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    void setNumero(NumeroCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = value;
    }

    LocalisationCarte getLocalisation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.localisation;
    }

    void setLocalisation(LocalisationCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.localisation = value;
    }

    TypCarte getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }

    void setType(TypCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }
    
    int getPoids() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.poids;
    }

    void setPoids(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.poids = value;
    }

    public static void main(String[] args ) {
    	Carte Macabo = new Carte(NumeroCarte._10,TypCarte.Pique);
    	System.out.println(Macabo);
    }
    

}
