import p1.*;
public class Lance {
	public static void main (String [] args) {
		Poulet p1 = new Poulet("POU", 2.0);
		Volaille.tab.add(p1);
		
		Canard c1 = new Canard("CAN", 1.5);
		Volaille.tab.add(c1);
		double prixC1 = c1.calculPrixVolaille();
		Afficher.d(prixC1);
		Volaille.affichertab();
		double prixElevage = Volaille.calculPrixElevage();
		Afficher.d(prixElevage);

	}
}//Fin class Lance