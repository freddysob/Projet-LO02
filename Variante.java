import java.util.ArrayList;
import java.util.List;
//import com.modeliosoft.modelio.javadesigner.annotations.objid;

import javax.swing.JOptionPane;


// @objid ("13fb79e4-c248-4e81-8baf-bddb4c4f4b1a")
public class Variante {
    // @objid ("6e8b6ac1-e09e-497f-9fd5-821f554c587c")
    private int nbJeuDeCartes;

    //@objid ("fcfb94d8-e310-468f-a3f9-7ab727361459")
    private TypVariante nom;

    //@objid ("5b9273cf-6a6f-4215-a1db-0ac1d9b0091b")
    public List<Carte> carte = new ArrayList<Carte> ();
    
    private int nombreCarteDebut;
    
    //@objid ("d61ad526-226d-4650-ab08-6ee425d1d67a")
    public Variante(int nbCartes, TypVariante nom) {
    	this.nbJeuDeCartes = nbCartes;
        this.nom = nom;
        switch (this.nom){
    	case Minimale:this.nombreCarteDebut=5;
    	case Monclar:this.nombreCarteDebut=5;
    	case Variante_1:this.nombreCarteDebut=5;
    	case Carte_et_Maou:this.nombreCarteDebut=5;
    	case Des_Ulis:this.nombreCarteDebut=5;
    	case Variante_4:this.nombreCarteDebut=5;
    	case Variante_5:this.nombreCarteDebut=5;
    	case Variante_6:this.nombreCarteDebut=5;
    	case Variante_Courte_Amicale:this.nombreCarteDebut=5;
    	case Man_et_resta:this.nombreCarteDebut=5;
        }
        //this.carte = this.genererJeuCartes();
    }
    
    public String toString(){
    	String s;
    	s="[ Variante: "+this.nom+"]";         // Affiche seulement le nom de la variante
    	return s;
    }

    //@objid ("8baf9c35-cec6-4486-9814-664a11b68306")
    public void changerPouvoirCarte() {
    }
    
    public List<Carte> creerCartes(TypVariante n){
    	List<Carte> s=new ArrayList<Carte> ();
    	return s;
    }

    //@objid ("d7988178-0c04-4e08-a169-5fc18a2f41f6")
    int getNbCartes() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbJeuDeCartes;
    }

    //@objid ("b7165d88-b9b2-4a8e-a1d8-21aafa36b941")
    void setNbCartes(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbJeuDeCartes = value;
    }

    //@objid ("38942509-883f-49b9-a5ad-763880ee0aaa")
    TypVariante getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    //@objid ("5cd91ef6-4df9-4ad9-ad25-8dc8ac9d8146")
    void setNom(TypVariante value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    //@objid ("edac1072-6daf-45d2-a4d0-bfa833579332")
    List<Carte> getCarte() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carte;
    }

    //@objid ("2dfb196e-189d-4fdd-b9f7-a3248e242b2b")
    void setCarte(List<Carte> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carte = value;
    }
    
    int getNombreCarteDebut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombreCarteDebut;
    }

    void setNombreCarteDebut(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombreCarteDebut = value;
    }    
    
    public List<Carte> genererJeuCartes(){
    	int i=0;
    	List<Carte> L = new ArrayList<Carte> ();
    	for(i=0; i<this.nbJeuDeCartes; i++){
    	switch (this.nom){
    	case Minimale:
    		Carte i0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(i0);
    		Carte i1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(i1);
    		Carte i2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(i2);
    		Carte i3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(i3);
    		Carte i4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(i4);
    		Carte i5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(i5);
    		Carte i6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(i6);
    		Carte i7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(i7);
    		Carte i8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(i8);
    		Carte i9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(i9);
    		Carte i46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(i46);
    		Carte i47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(i47);
    		Carte i48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(i48);
    		Carte i10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(i10);
    		Carte i11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(i11);
    		Carte i12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(i12);
    		Carte i13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(i13);
    		Carte i14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(i14);
    		Carte i15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(i15);
    		Carte i16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(i16);
    		Carte i17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(i17);
    		Carte i18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(i18);
    		Carte i19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(i19);
    		Carte i50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(i50);
    		Carte i51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(i51);
    		Carte i52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(i52);
    		Carte i49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(i49);
    		Carte i20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(i20);
    		Carte i21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(i21);
    		Carte i22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(i22);
    		Carte i23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(i23);
    		Carte i24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(i24);
    		Carte i25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(i25);
    		Carte i26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(i26);
    		Carte i27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(i27);
    		Carte i28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(i28);
    		Carte i29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(i29);
    		Carte i43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(i43);
    		Carte i44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(i44);
    		Carte i45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(i45);
    		Carte i30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(i30);
    		Carte i31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(i31);
    		Carte i32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(i32);
    		Carte i33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(i33);
    		Carte i34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(i34);
    		Carte i35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(i35);
    		Carte i36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(i36);
    		Carte i37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(i37);
    		Carte i38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(i38);
    		Carte i53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(i53);
    		Carte i39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(i39);
    		Carte i40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(i40);
    		Carte i41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(i41);
    		Carte i42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(i42);
    		break;
    
    	case Monclar:
    		Carte j0=new Piocheur3(NumeroCarte._1,TypCarte.Pique);
    		L.add(j0);
    		Carte j1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(j1);
    		Carte j2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(j2);
    		Carte j3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(j3);
    		Carte j4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(j4);
    		Carte j5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(j5);
    		Carte j6=new StopperSuivant(NumeroCarte._7,TypCarte.Pique);
    		L.add(j6);
    		Carte j7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(j7);
    		Carte j8=new Piocheur1(NumeroCarte._9,TypCarte.Pique);
    		L.add(j8);
    		Carte j9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(j9);
    		Carte j46=new Inverseur(NumeroCarte._V,TypCarte.Pique);
    		L.add(j46);
    		Carte j47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(j47);
    		Carte j48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(j48);
    		Carte j10=new Piocheur3(NumeroCarte._1,TypCarte.Coeur);
    		L.add(j10);
    		Carte j11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(j11);
    		Carte j12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(j12);
    		Carte j13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(j13);
    		Carte j14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(j14);
    		Carte j15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(j15);
    		Carte j16=new StopperSuivant(NumeroCarte._7,TypCarte.Coeur);
    		L.add(j16);
    		Carte j17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(j17);
    		Carte j18=new Piocheur1(NumeroCarte._9,TypCarte.Coeur);
    		L.add(j18);
    		Carte j19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(j19);
    		Carte j50=new Inverseur(NumeroCarte._V,TypCarte.Coeur);
    		L.add(j50);
    		Carte j51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(j51);
    		Carte j52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(j52);
    		Carte j49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(j49);
    		Carte j20=new Piocheur3(NumeroCarte._1,TypCarte.Carreau);
    		L.add(j20);
    		Carte j21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(j21);
    		Carte j22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(j22);
    		Carte j23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(j23);
    		Carte j24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(j24);
    		Carte j25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(j25);
    		Carte j26=new StopperSuivant(NumeroCarte._7,TypCarte.Carreau);
    		L.add(j26);
    		Carte j27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(j27);
    		Carte j28=new Piocheur1(NumeroCarte._9,TypCarte.Carreau);
    		L.add(j28);
    		Carte j29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(j29);
    		Carte j43=new Inverseur(NumeroCarte._V,TypCarte.Carreau);
    		L.add(j43);
    		Carte j44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(j44);
    		Carte j45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(j45);
    		Carte j30=new Piocheur3(NumeroCarte._1,TypCarte.Trefle);
    		L.add(j30);
    		Carte j31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(j31);
    		Carte j32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(j32);
    		Carte j33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(j33);
    		Carte j34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(j34);
    		Carte j35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(j35);
    		Carte j36=new StopperSuivant(NumeroCarte._7,TypCarte.Trefle);
    		L.add(j36);
    		Carte j37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(j37);
    		Carte j38=new Piocheur1(NumeroCarte._9,TypCarte.Trefle);
    		L.add(j38);
    		Carte j53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(j53);
    		Carte j39=new Inverseur(NumeroCarte._V,TypCarte.Trefle);
    		L.add(j39);
    		Carte j40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(j40);
    		Carte j41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(j41);
    		Carte j42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(j42);
    		break;
    	case Variante_1:
    		Carte k0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(k0);
    		Carte k1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(k1);
    		Carte k2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(k2);
    		Carte k3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(k3);
    		Carte k4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(k4);
    		Carte k5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(k5);
    		Carte k6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(k6);
    		Carte k7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(k7);
    		Carte k8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(k8);
    		Carte k9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(k9);
    		Carte k46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(k46);
    		Carte k47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(k47);
    		Carte k48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(k48);
    		Carte k10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(k10);
    		Carte k11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(k11);
    		Carte k12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(k12);
    		Carte k13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(k13);
    		Carte k14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(k14);
    		Carte k15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(k15);
    		Carte k16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(k16);
    		Carte k17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(k17);
    		Carte k18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(k18);
    		Carte k19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(k19);
    		Carte k50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(k50);
    		Carte k51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(k51);
    		Carte k52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(k52);
    		Carte k49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(k49);
    		Carte k20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(k20);
    		Carte k21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(k21);
    		Carte k22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(k22);
    		Carte k23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(k23);
    		Carte k24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(k24);
    		Carte k25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(k25);
    		Carte k26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(k26);
    		Carte k27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(k27);
    		Carte k28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(k28);
    		Carte k29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(k29);
    		Carte k43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(k43);
    		Carte k44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(k44);
    		Carte k45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(k45);
    		Carte k30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(k30);
    		Carte k31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(k31);
    		Carte k32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(k32);
    		Carte k33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(k33);
    		Carte k34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(k34);
    		Carte k35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(k35);
    		Carte k36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(k36);
    		Carte k37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(k37);
    		Carte k38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(k38);
    		Carte k53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(k53);
    		Carte k39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(k39);
    		Carte k40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(k40);
    		Carte k41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(k41);
    		Carte k42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(k42);
    		break;

    	case Carte_et_Maou:
    		Carte l0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(l0);
    		Carte l1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(l1);
    		Carte l2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(l2);
    		Carte l3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(l3);
    		Carte l4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(l4);
    		Carte l5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(l5);
    		Carte l6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(l6);
    		Carte l7=new StopperSuivant(NumeroCarte._8,TypCarte.Pique);
    		L.add(l7);
    		Carte l8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(l8);
    		Carte l9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(l9);
    		Carte l46=new Commande(NumeroCarte._V,TypCarte.Pique);
    		L.add(l46);
    		Carte l47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(l47);
    		Carte l48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(l48);
    		Carte l10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(l10);
    		Carte l11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(l11);
    		Carte l12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(l12);
    		Carte l13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(l13);
    		Carte l14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(l14);
    		Carte l15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(l15);
    		Carte l16=new Piocheur2(NumeroCarte._7,TypCarte.Coeur);
    		L.add(l16);
    		Carte l17=new StopperSuivant(NumeroCarte._8,TypCarte.Coeur);
    		L.add(l17);
    		Carte l18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(l18);
    		Carte l19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(l19);
    		Carte l50=new Commande(NumeroCarte._V,TypCarte.Coeur);
    		L.add(l50);
    		Carte l51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(l51);
    		Carte l52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(l52);
    		Carte l49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(l49);
    		Carte l20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(l20);
    		Carte l21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(l21);
    		Carte l22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(l22);
    		Carte l23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(l23);
    		Carte l24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(l24);
    		Carte l25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(l25);
    		Carte l26=new Piocheur2(NumeroCarte._7,TypCarte.Carreau);
    		L.add(l26);
    		Carte l27=new StopperSuivant(NumeroCarte._8,TypCarte.Carreau);
    		L.add(l27);
    		Carte l28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(l28);
    		Carte l29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(l29);
    		Carte l43=new Commande(NumeroCarte._V,TypCarte.Carreau);
    		L.add(l43);
    		Carte l44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(l44);
    		Carte l45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(l45);
    		Carte l30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(l30);
    		Carte l31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(l31);
    		Carte l32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(l32);
    		Carte l33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(l33);
    		Carte l34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(l34);
    		Carte l35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(l35);
    		Carte l36=new Piocheur2(NumeroCarte._7,TypCarte.Trefle);
    		L.add(l36);
    		Carte l37=new StopperSuivant(NumeroCarte._8,TypCarte.Trefle);
    		L.add(l37);
    		Carte l38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(l38);
    		Carte l53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(l53);
    		Carte l39=new Commande(NumeroCarte._V,TypCarte.Trefle);
    		L.add(l39);
    		Carte l40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(l40);
    		Carte l41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(l41);
    		Carte l42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(l42);
    		break;

    	case Des_Ulis:
    		Carte m0=new Piocheur2(NumeroCarte._1,TypCarte.Pique);
    		L.add(m0);
    		Carte m1=new StopperSuivant(NumeroCarte._2,TypCarte.Pique);
    		L.add(m1);
    		Carte m2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(m2);
    		Carte m3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(m3);
    		Carte m4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(m4);
    		Carte m5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(m5);
    		Carte m6=new Rejoueur(NumeroCarte._7,TypCarte.Pique);
    		L.add(m6);
    		Carte m7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(m7);
    		Carte m8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(m8);
    		Carte m9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(m9);
    		Carte m46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(m46);
    		Carte m47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(m47);
    		Carte m48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(m48);
    		Carte m10=new Piocheur2(NumeroCarte._1,TypCarte.Coeur);
    		L.add(m10);
    		Carte m11=new StopperSuivant(NumeroCarte._2,TypCarte.Coeur);
    		L.add(m11);
    		Carte m12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(m12);
    		Carte m13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(m13);
    		Carte m14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(m14);
    		Carte m15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(m15);
    		Carte m16=new Rejoueur(NumeroCarte._7,TypCarte.Coeur);
    		L.add(m16);
    		Carte m17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(m17);
    		Carte m18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(m18);
    		Carte m19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(m19);
    		Carte m50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(m50);
    		Carte m51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(m51);
    		Carte m52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(m52);
    		Carte m49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(m49);
    		Carte m20=new Piocheur2(NumeroCarte._1,TypCarte.Carreau);
    		L.add(m20);
    		Carte m21=new StopperSuivant(NumeroCarte._2,TypCarte.Carreau);
    		L.add(m21);
    		Carte m22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(m22);
    		Carte m23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(m23);
    		Carte m24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(m24);
    		Carte m25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(m25);
    		Carte m26=new Rejoueur(NumeroCarte._7,TypCarte.Carreau);
    		L.add(m26);
    		Carte m27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(m27);
    		Carte m28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(m28);
    		Carte m29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(m29);
    		Carte m43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(m43);
    		Carte m44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(m44);
    		Carte m45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(m45);
    		Carte m30=new Piocheur2(NumeroCarte._1,TypCarte.Trefle);
    		L.add(m30);
    		Carte m31=new StopperSuivant(NumeroCarte._2,TypCarte.Trefle);
    		L.add(m31);
    		Carte m32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(m32);
    		Carte m33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(m33);
    		Carte m34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(m34);
    		Carte m35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(m35);
    		Carte m36=new Rejoueur(NumeroCarte._7,TypCarte.Trefle);
    		L.add(m36);
    		Carte m37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(m37);
    		Carte m38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(m38);
    		Carte m53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(m53);
    		Carte m39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(m39);
    		Carte m40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(m40);
    		Carte m41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(m41);
    		Carte m42=new Carte(NumeroCarte._J,TypCarte.JN);
    		L.add(m42);
    		break;

    	case Variante_4:
    		Carte n0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(n0);
    		Carte n1=new Piocheur4(NumeroCarte._2,TypCarte.Pique);
    		L.add(n1);
    		Carte n2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(n2);
    		Carte n3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(n3);
    		Carte n4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(n4);
    		Carte n5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(n5);
    		Carte n6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(n6);
    		Carte n7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(n7);
    		Carte n8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(n8);
    		Carte n9=new Inverseur(NumeroCarte._10,TypCarte.Pique);
    		L.add(n9);
    		Carte n46=new StopperSuivant(NumeroCarte._V,TypCarte.Pique);
    		L.add(n46);
    		Carte n47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(n47);
    		Carte n48=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(n48);
    		Carte n10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(n10);
    		Carte n11=new Piocheur2(NumeroCarte._2,TypCarte.Coeur);
    		L.add(n11);
    		Carte n12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(n12);
    		Carte n13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(n13);
    		Carte n14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(n14);
    		Carte n15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(n15);
    		Carte n16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(n16);
    		Carte n17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(n17);
    		Carte n18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(n18);
    		Carte n19=new Inverseur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(n19);
    		Carte n50=new StopperSuivant(NumeroCarte._V,TypCarte.Coeur);
    		L.add(n50);
    		Carte n51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(n51);
    		Carte n52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(n52);
    		Carte n49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(n49);
    		Carte n20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(n20);
    		Carte n21=new Piocheur2(NumeroCarte._2,TypCarte.Carreau);
    		L.add(n21);
    		Carte n22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(n22);
    		Carte n23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(n23);
    		Carte n24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(n24);
    		Carte n25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(n25);
    		Carte n26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(n26);
    		Carte n27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(n27);
    		Carte n28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(n28);
    		Carte n29=new Inverseur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(n29);
    		Carte n43=new StopperSuivant(NumeroCarte._V,TypCarte.Carreau);
    		L.add(n43);
    		Carte n44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(n44);
    		Carte n45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(n45);
    		Carte n30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(n30);
    		Carte n31=new Piocheur2(NumeroCarte._2,TypCarte.Trefle);
    		L.add(n31);
    		Carte n32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(n32);
    		Carte n33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(n33);
    		Carte n34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(n34);
    		Carte n35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(n35);
    		Carte n36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(n36);
    		Carte n37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(n37);
    		Carte n38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(n38);
    		Carte n53=new Inverseur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(n53);
    		Carte n39=new StopperSuivant(NumeroCarte._V,TypCarte.Trefle);
    		L.add(n39);
    		Carte n40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(n40);
    		Carte n41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(n41);
    		Carte n42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(n42);
    		break;

    	case Variante_5:
    		Carte o0=new Piocheur2(NumeroCarte._1,TypCarte.Pique);
    		L.add(o0);
    		Carte o1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(o1);
    		Carte o2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(o2);
    		Carte o3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(o3);
    		Carte o4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(o4);
    		Carte o5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(o5);
    		Carte o6=new Inverseur(NumeroCarte._7,TypCarte.Pique);
    		L.add(o6);
    		Carte o7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(o7);
    		Carte o8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(o8);
    		Carte o9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(o9);
    		Carte o46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(o46);
    		Carte o47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(o47);
    		Carte o48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(o48);
    		Carte o10=new Piocheur2(NumeroCarte._1,TypCarte.Coeur);
    		L.add(o10);
    		Carte o11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(o11);
    		Carte o12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(o12);
    		Carte o13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(o13);
    		Carte o14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(o14);
    		Carte o15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(o15);
    		Carte o16=new Inverseur(NumeroCarte._7,TypCarte.Coeur);
    		L.add(o16);
    		Carte o17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(o17);
    		Carte o18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(o18);
    		Carte o19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(o19);
    		Carte o50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(o50);
    		Carte o51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(o51);
    		Carte o52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(o52);
    		Carte o49=new Carte(NumeroCarte._J,TypCarte.JR);
    		L.add(o49);
    		Carte o20=new Piocheur2(NumeroCarte._1,TypCarte.Carreau);
    		L.add(o20);
    		Carte o21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(o21);
    		Carte o22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(o22);
    		Carte o23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(o23);
    		Carte o24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(o24);
    		Carte o25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(o25);
    		Carte o26=new Inverseur(NumeroCarte._7,TypCarte.Carreau);
    		L.add(o26);
    		Carte o27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(o27);
    		Carte o28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(o28);
    		Carte o29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(o29);
    		Carte o43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(o43);
    		Carte o44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(o44);
    		Carte o45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(o45);
    		Carte o30=new Piocheur2(NumeroCarte._1,TypCarte.Trefle);
    		L.add(o30);
    		Carte o31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(o31);
    		Carte o32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(o32);
    		Carte o33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(o33);
    		Carte o34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(o34);
    		Carte o35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(o35);
    		Carte o36=new Inverseur(NumeroCarte._7,TypCarte.Trefle);
    		L.add(o36);
    		Carte o37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(o37);
    		Carte o38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(o38);
    		Carte o53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(o53);
    		Carte o39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(o39);
    		Carte o40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(o40);
    		Carte o41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(o41);
    		Carte o42=new Carte(NumeroCarte._J,TypCarte.JN);
    		L.add(o42);
    		break;

    	case Variante_6:
    		Carte z0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(z0);
    		Carte z1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(z1);
    		Carte z2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(z2);
    		Carte z3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(z3);
    		Carte z4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(z4);
    		Carte z5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(z5);
    		Carte z6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(z6);
    		Carte z7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(z7);
    		Carte z8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(z8);
    		Carte z9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(z9);
    		Carte z46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(z46);
    		Carte z47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(z47);
    		Carte z48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(z48);
    		Carte z10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(z10);
    		Carte z11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(z11);
    		Carte z12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(z12);
    		Carte z13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(z13);
    		Carte z14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(z14);
    		Carte z15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(z15);
    		Carte z16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(z16);
    		Carte z17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(z17);
    		Carte z18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(z18);
    		Carte z19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(z19);
    		Carte z50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(z50);
    		Carte z51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(z51);
    		Carte z52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(z52);
    		Carte z49=new Carte(NumeroCarte._J,TypCarte.JR);
    		L.add(z49);
    		Carte z20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(z20);
    		Carte z21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(z21);
    		Carte z22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(z22);
    		Carte z23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(z23);
    		Carte z24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(z24);
    		Carte z25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(z25);
    		Carte z26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(z26);
    		Carte z27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(z27);
    		Carte z28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(z28);
    		Carte z29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(z29);
    		Carte z43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(z43);
    		Carte z44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(z44);
    		Carte z45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(z45);
    		Carte z30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(z30);
    		Carte z31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(z31);
    		Carte z32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(z32);
    		Carte z33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(z33);
    		Carte z34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(z34);
    		Carte z35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(z35);
    		Carte z36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(z36);
    		Carte z37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(z37);
    		Carte z38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(z38);
    		Carte z53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(z53);
    		Carte z39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(z39);
    		Carte z40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(z40);
    		Carte z41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(z41);
    		Carte z42=new Carte(NumeroCarte._J,TypCarte.JN);
    		L.add(z42);
    		break;

    	case Variante_Courte_Amicale:
    		Carte y0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(y0);
    		Carte y1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(y1);
    		Carte y2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(y2);
    		Carte y3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(y3);
    		Carte y4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(y4);
    		Carte y5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(y5);
    		Carte y6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(y6);
    		Carte y7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(y7);
    		Carte y8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(y8);
    		Carte y9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(y9);
    		Carte y46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(y46);
    		Carte y47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(y47);
    		Carte y48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(y48);
    		Carte y10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(y10);
    		Carte y11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(y11);
    		Carte y12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(y12);
    		Carte y13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(y13);
    		Carte y14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(y14);
    		Carte y15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(y15);
    		Carte y16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(y16);
    		Carte y17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(y17);
    		Carte y18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(y18);
    		Carte y19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(y19);
    		Carte y50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(y50);
    		Carte y51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(y51);
    		Carte y52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(y52);
    		Carte y49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(y49);
    		Carte y20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(y20);
    		Carte y21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(y21);
    		Carte y22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(y22);
    		Carte y23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(y23);
    		Carte y24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(y24);
    		Carte y25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(y25);
    		Carte y26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(y26);
    		Carte y27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(y27);
    		Carte y28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(y28);
    		Carte y29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(y29);
    		Carte y43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(y43);
    		Carte y44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(y44);
    		Carte y45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(y45);
    		Carte y30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(y30);
    		Carte y31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(y31);
    		Carte y32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(y32);
    		Carte y33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(y33);
    		Carte y34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(y34);
    		Carte y35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(y35);
    		Carte y36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(y36);
    		Carte y37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(y37);
    		Carte y38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(y38);
    		Carte y53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(y53);
    		Carte y39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(y39);
    		Carte y40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(y40);
    		Carte y41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(y41);
    		Carte y42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(y42);
    		break;

    	case Man_et_resta:
    		
    		Carte p0=new Carte(NumeroCarte._1,TypCarte.Pique);
    		L.add(p0);
    		Carte p1=new Carte(NumeroCarte._2,TypCarte.Pique);
    		L.add(p1);
    		Carte p2=new Carte(NumeroCarte._3,TypCarte.Pique);
    		L.add(p2);
    		Carte p3=new Carte(NumeroCarte._4,TypCarte.Pique);
    		L.add(p3);
    		Carte p4=new Carte(NumeroCarte._5,TypCarte.Pique);
    		L.add(p4);
    		Carte p5=new Carte(NumeroCarte._6,TypCarte.Pique);
    		L.add(p5);
    		Carte p6=new Carte(NumeroCarte._7,TypCarte.Pique);
    		L.add(p6);
    		Carte p7=new Commande(NumeroCarte._8,TypCarte.Pique);
    		L.add(p7);
    		Carte p8=new Carte(NumeroCarte._9,TypCarte.Pique);
    		L.add(p8);
    		Carte p9=new Rejoueur(NumeroCarte._10,TypCarte.Pique);
    		L.add(p9);
    		Carte p46=new Carte(NumeroCarte._V,TypCarte.Pique);
    		L.add(p46);
    		Carte p47=new Carte(NumeroCarte._D,TypCarte.Pique);
    		L.add(p47);
    		Carte p48=new Carte(NumeroCarte._R,TypCarte.Pique);
    		L.add(p48);
    		Carte p10=new Carte(NumeroCarte._1,TypCarte.Coeur);
    		L.add(p10);
    		Carte p11=new Carte(NumeroCarte._2,TypCarte.Coeur);
    		L.add(p11);
    		Carte p12=new Carte(NumeroCarte._3,TypCarte.Coeur);
    		L.add(p12);
    		Carte p13=new Carte(NumeroCarte._4,TypCarte.Coeur);
    		L.add(p13);
    		Carte p14=new Carte(NumeroCarte._5,TypCarte.Coeur);
    		L.add(p14);
    		Carte p15=new Carte(NumeroCarte._6,TypCarte.Coeur);
    		L.add(p15);
    		Carte p16=new Carte(NumeroCarte._7,TypCarte.Coeur);
    		L.add(p16);
    		Carte p17=new Commande(NumeroCarte._8,TypCarte.Coeur);
    		L.add(p17);
    		Carte p18=new Carte(NumeroCarte._9,TypCarte.Coeur);
    		L.add(p18);
    		Carte p19=new Rejoueur(NumeroCarte._10,TypCarte.Coeur);
    		L.add(p19);
    		Carte p50=new Carte(NumeroCarte._V,TypCarte.Coeur);
    		L.add(p50);
    		Carte p51=new Carte(NumeroCarte._D,TypCarte.Coeur);
    		L.add(p51);
    		Carte p52=new Carte(NumeroCarte._R,TypCarte.Coeur);
    		L.add(p52);
    		Carte p49=new Piocheur5(NumeroCarte._J,TypCarte.JR);
    		L.add(p49);
    		Carte p20=new Carte(NumeroCarte._1,TypCarte.Carreau);
    		L.add(p20);
    		Carte p21=new Carte(NumeroCarte._2,TypCarte.Carreau);
    		L.add(p21);
    		Carte p22=new Carte(NumeroCarte._3,TypCarte.Carreau);
    		L.add(p22);
    		Carte p23=new Carte(NumeroCarte._4,TypCarte.Carreau);
    		L.add(p23);
    		Carte p24=new Carte(NumeroCarte._5,TypCarte.Carreau);
    		L.add(p24);
    		Carte p25=new Carte(NumeroCarte._6,TypCarte.Carreau);
    		L.add(p25);
    		Carte p26=new Carte(NumeroCarte._7,TypCarte.Carreau);
    		L.add(p26);
    		Carte p27=new Commande(NumeroCarte._8,TypCarte.Carreau);
    		L.add(p27);
    		Carte p28=new Carte(NumeroCarte._9,TypCarte.Carreau);
    		L.add(p28);
    		Carte p29=new Rejoueur(NumeroCarte._10,TypCarte.Carreau);
    		L.add(p29);
    		Carte p43=new Carte(NumeroCarte._V,TypCarte.Carreau);
    		L.add(p43);
    		Carte p44=new Carte(NumeroCarte._D,TypCarte.Carreau);
    		L.add(p44);
    		Carte p45=new Carte(NumeroCarte._R,TypCarte.Carreau);
    		L.add(p45);
    		Carte p30=new Carte(NumeroCarte._1,TypCarte.Trefle);
    		L.add(p30);
    		Carte p31=new Carte(NumeroCarte._2,TypCarte.Trefle);
    		L.add(p31);
    		Carte p32=new Carte(NumeroCarte._3,TypCarte.Trefle);
    		L.add(p32);
    		Carte p33=new Carte(NumeroCarte._4,TypCarte.Trefle);
    		L.add(p33);
    		Carte p34=new Carte(NumeroCarte._5,TypCarte.Trefle);
    		L.add(p34);
    		Carte p35=new Carte(NumeroCarte._6,TypCarte.Trefle);
    		L.add(p35);
    		Carte p36=new Carte(NumeroCarte._7,TypCarte.Trefle);
    		L.add(p36);
    		Carte p37=new Commande(NumeroCarte._8,TypCarte.Trefle);
    		L.add(p37);
    		Carte p38=new Carte(NumeroCarte._9,TypCarte.Trefle);
    		L.add(p38);
    		Carte p53=new Rejoueur(NumeroCarte._10,TypCarte.Trefle);
    		L.add(p53);
    		Carte p39=new Carte(NumeroCarte._V,TypCarte.Trefle);
    		L.add(p39);
    		Carte p40=new Carte(NumeroCarte._D,TypCarte.Trefle);
    		L.add(p40);
    		Carte p41=new Carte(NumeroCarte._R,TypCarte.Trefle);
    		L.add(p41);
    		Carte p42=new Piocheur5(NumeroCarte._J,TypCarte.JN);
    		L.add(p42);
    		break;
    	
    	}
    	}
    	return L;
    	}
    
    public void choisirVariante(){
		String[] variante = {"basique", "Monclar","1","Carte et Maou", "Des Ulis", "4", "5", "6", "Courte Amicale", "Man et resta"};

	    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		   
		    int n = jop.showOptionDialog(null, 

		      "Selectionnez une variante",

		      "Choix variante",

		      JOptionPane.YES_NO_CANCEL_OPTION,

		      JOptionPane.QUESTION_MESSAGE,

		      null,

		      variante,

		      variante[9]);

				if (n==0){
					this.setNom(TypVariante.Minimale);
				}
				else if (n==1){
					this.setNom(TypVariante.Monclar);
				}
				else if(n==2){
					this.setNom(TypVariante.Variante_1);
				}
				else if(n==3){
					this.setNom(TypVariante.Carte_et_Maou);
				}
				else if(n==4){
					this.setNom(TypVariante.Des_Ulis);
				}
				else if(n==5){
					this.setNom(TypVariante.Variante_4);
				}
				else if(n==6){
					this.setNom(TypVariante.Variante_5);
				}
				else if(n==7){
					this.setNom(TypVariante.Variante_6);
				}
				else if(n==8){
					this.setNom(TypVariante.Variante_Courte_Amicale);
				}
				else if(n==9){
					this.setNom(TypVariante.Man_et_resta);
				}
	}
    
	public static void main(String[] args ) {
    	Variante V = new Variante(1,TypVariante.Minimale);
    	System.out.println(V.genererJeuCartes());
    }

    
}
