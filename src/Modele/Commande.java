package Modele;

import java.util.Scanner;

public class Commande extends Carte {
	
	public Commande(NumeroCarte num, TypCarte typ) {
		super(num, typ, 23);
		// TODO Auto-generated constructor stub
	}

	public void appliquerPouvoir(Manche manche, Joueur J) {
	  String var="";
	  String Co="Co";
	  String C="C";
	  String T="T";
	  String P="P";
	  boolean o=true;
	  if (J.isTypePhysique() && J.manche.partie.isText()){
		  
		  while (o){
	  System.out.println("Choisissez le type de carte souhaité");
	  System.out.println("Co pour Coeur");
	  System.out.println("C pour Carreau");
	  System.out.println("T pour Trèfle");
	  System.out.println("P pour pique");
	  System.out.println("o :"+o+".");
	  Scanner sc = new Scanner(System.in);
	  var=sc.nextLine();
	  
	  System.out.println("Var: "+var+".");
	  
		if(var.equals(Co)){
			o=false;
		manche.tatamis.setType(TypCarte.Coeur);
		manche.tatamis.setNumero(NumeroCarte._8);
		System.out.println(""+J.getNom()+" commande Coeur");
		}
		else if (var.equals(C)){
			o=false;
			manche.tatamis.setType(TypCarte.Carreau);
			manche.tatamis.setNumero(NumeroCarte._8);
			System.out.println(""+J.getNom()+" commande Carreau");
			}
		else if (var.equals(T)){
			o=false;
			manche.tatamis.setType(TypCarte.Trefle);
			manche.tatamis.setNumero(NumeroCarte._8);
			System.out.println(""+J.getNom()+" commande Trefle");
			}
		else if (var.equals(P)){
			o=false;
			manche.tatamis.setType(TypCarte.Pique);
			manche.tatamis.setNumero(NumeroCarte._8);
			System.out.println(""+J.getNom()+" commande Pique");
			}
		else {System.out.println("Saisie invalide, veuillez reprendre");}
	 } 
	  }
	  else {
		  
		  int i;
		  int i1=0;
		  int i2=0;
		  int i3=0;
		  int i4=0;
		  for(i=0;i<J.hand.carte.size();i++){
			  if(J.hand.carte.get(i).getType()==TypCarte.Pique){
				  i1+=1;
			  }
			  if(J.hand.carte.get(i).getType()==TypCarte.Trefle){
				  i2+=1;
			  }
			  if(J.hand.carte.get(i).getType()==TypCarte.Coeur){
				  i3+=1;  
			  }
			  if(J.hand.carte.get(i).getType()==TypCarte.Carreau){
				  i4+=1;
			  }
		  }
		  
		  int r =Math.max(Math.max(Math.max(i1,i2),Math.max(i3,i4)),Math.max(Math.max(i2,i3),Math.max(i1,i4)));
		  
		  if (i1==r){
			  manche.tatamis.changeType(TypCarte.Pique);
			  System.out.println(""+J.getNom()+" commande Pique");
		  }
		  else if (i2==r){
			  manche.tatamis.changeType(TypCarte.Trefle);
			  System.out.println(""+J.getNom()+" commande Trefle");
		  }
		  else if (i3==r){
			  manche.tatamis.changeType(TypCarte.Coeur);
			  System.out.println(""+J.getNom()+" commande Coeur");
		  }
		  else if (i4==r){
			  manche.tatamis.changeType(TypCarte.Carreau);
			  System.out.println(""+J.getNom()+" commande Carreau");
		  }
		  
		  }
	  //sc.close();
	  
	}
	public void appliquerPouvoir(Manche manche, int n) {
		  if (n==3){
			  manche.tatamis.changeType(TypCarte.Pique);
			  System.out.println(" commande Pique");
		  }
		  else if (n==2){
			  manche.tatamis.changeType(TypCarte.Trefle);
			  System.out.println(" commande Trefle");
		  }
		  else if (n==0){
			  manche.tatamis.changeType(TypCarte.Coeur);
			  System.out.println(" commande Coeur");
		  }
		  else if (n==1){
			  manche.tatamis.changeType(TypCarte.Carreau);
			  System.out.println(" commande Carreau");
		  }
		  
	}
	
	
	public static void main(String[] args ) {
    	
    }
}