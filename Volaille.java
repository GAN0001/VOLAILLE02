import p1.*;
import java.util.ArrayList;
public class Volaille {
	String id = "";
	double poids = 0;
	static ArrayList<Volaille> tab = new ArrayList<Volaille>();

	public Volaille(String pId, double pPoids) {
		id = Matricule.getMatricule(pId);
		poids = pPoids;
	}

	public void afficher () {
		System.out.println("Identification de la volaille : " + id + "  " + "Poids : " + poids);
	}

/*	public void afficher() {
		String ident = "";
		Poulet p = null;
		for(Volaille v : tab){
			ident = id.substring(0,3);
			Afficher.S("Ident : " + ident);
			if(ident.equals("POU")) {
				p =(Poulet)v;
				p.afficher();
			}
		}
	}
*/








}//Fin class Volaille