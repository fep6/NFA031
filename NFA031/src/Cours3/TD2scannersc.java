package Cours3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TD2scannersc {

	private double euros =0;
	private double francs = 0;
	private int choix = 0;
	private Scanner scChoix = new Scanner (System.in);
	private Scanner sc = new Scanner (System.in);
	
	private int x;
	
		TD2scannersc() {
			
//			( Raccourci bloc commentaire : ctrl+ shift + / )
//			Analyse et conception: Déterminer 
//				1/ Les entrées
//						Choix de la conversion (Euro -> Francs ou inverse)
//						Choix de la conversion (Euro -> Francs ou inverse)
//				2/ Les sorties
//						Résultat en Francs
//						Résultat en Euros
//				3/ Pseudo code	

			setChoixDeConversion();
			setConversion();
	}
		
		private void setChoixDeConversion() {			
			for (int i=0;i<2;i++) {
// 			Raccourci System.out.println : sysout + ctrl & espace
			System.out.println("****");
			}
			System.out.println("Voulez-vous une conversion en Euros->Francs (tapez '1') ou Francs->Euros? (tapez '2')");
			choix = scChoix.nextInt();
			
			
			// Gestion d'exception à mieux gérer!!!
			
//			try {
//				choix = scChoix.nextInt();
//			} catch(Exception e) {
//			    System.out.println("Mauvais typage!!!");
//			    e.printStackTrace();
//			}
		
			
			
			if (choix != 1 && choix != 2) {
				System.out.println("ATTENTION! votre choix doit être '1' ou '2'!!!");
				setChoixDeConversion();
			}		
		}
		
		private void setConversion(){
			if (choix == 1) {
					System.out.println("Somme en euros?");
					euros = sc.nextDouble();
					francs = euros*6.559;
					System.out.println("Le résultat pour " + euros+ "€ en Francs est:" + francs);
				} else {
					System.out.println("Somme en Francs?");
					francs = sc.nextDouble();
					euros =francs/6.559;
					System.out.println("Le résultat pour " + francs + "Francs en € est:" + euros);
			}

		}
		
		

}
