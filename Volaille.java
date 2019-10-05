import p1.*;
import java.util.ArrayList;
public class Volaille {
	String id = "";
	double poids = 0;
	static ArrayList<Volaille> tab = new ArrayList<Volaille>();
	double prixJPoulet = 2.0;
	double prixJCanard = 2.5;
	static double prixUneVolaille = 0f;
	static double prixElevage = 0f;

	public Volaille(String pId, double pPoids) {
		id = Matricule.getMatricule(pId);
		poids = pPoids;
	}

	public void afficher () {
		System.out.println("Identifiant : " + id + "  " + "Poids : " + poids);
	}

	public static void affichertab() {
		for(Volaille v : tab) {
			v.afficher();
		}
	}

	public double calculPrixVolaille() {
		if(id.substring(0,3).equals( "POU")) {
			prixUneVolaille = poids * prixJPoulet; 
		}
		else if(id.substring(0,3).equals( "CAN")) {
			prixUneVolaille = poids * prixJCanard; 
		}
	       return prixUneVolaille;
	} 

	public static double calculPrixElevage() {
		for(Volaille v : tab) {
			prixUneVolaille = v.calculPrixVolaille();
			prixElevage = prixElevage + prixUneVolaille;
		}
	       return prixElevage;
	}


}//Fin class Volaille