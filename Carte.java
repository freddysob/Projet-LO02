import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e552cddb-2d13-42de-8744-8d933700a4a5")
public class Carte {
    @objid ("2fdaee7f-bf98-439f-8929-907831018dcf")
    private numerosCarte numero;

    @objid ("d8f4c5d5-f50e-4ced-b3c5-14abf51bc78a")
    private typCarte type;

    @objid ("21f64c68-6feb-4d38-a211-20d3eae4718e")
    private LocalisationCarte localisation;
    
    @objid ("9303220a-4dde-4ffe-8d74-9dbd2bcda168")
    public Carte(numerosCarte num, typCarte typ) {
    	this.numero=num;
    	this.type=typ;
    	this.localisation=Pioche;
    }
    
    public String toString(){
    	String s;
    	s="["+this.getType()+","+this.getNumero()+"]";
    	return s;
    }

    @objid ("e17c43a5-bd54-4afc-a26e-e7d0719b076c")
    protected void finalize() {
    }

    @objid ("bb607436-5a85-4c20-ae05-1bc967a5a60d")
    public void appliquerPouvoir() {
    }

    @objid ("9360b926-8b43-4610-9468-02bdf738200f")
    numerosCarte getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    @objid ("2a8d3d50-82e5-4432-9c63-7e7332c97802")
    void setNumero(numerosCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = value;
    }

    @objid ("d7fa9fc5-ec52-43ec-afdb-57b88abf9caa")
    LocalisationCarte getLocalisation() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.localisation;
    }

    @objid ("aedfbaf9-b188-48b5-a675-69b9d93eb553")
    void setLocalisation(LocalisationCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.localisation = value;
    }

    @objid ("cf5c77d7-2419-4582-9fce-9396f2d672a3")
    typCarte getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }

    @objid ("cea17c48-5cae-47cc-9a59-868a9dba7882")
    void setType(typCarte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }

    public static void main(String[] args ) {
    	Carte Macabo = new Carte(10,Pique);
    	System.out.println(Macabo);
    }
    

}
