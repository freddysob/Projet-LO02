package PackageLO02;

public class Carte {
    private NumerosCarte numero;

    private TypCarte type;

    private LocalisationCarte localisation;
    
    public Carte(NumerosCarte num, TypCarte typ) {
    	this.numero=num;
    	this.type=typ;
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

    NumerosCarte getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    void setNumero(NumerosCarte value) {
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

    public static void main(String[] args ) {
    	Carte Macabo = new Carte(NumerosCarte._10,TypCarte.Pique);
    	System.out.println(Macabo);
    }
    

}
