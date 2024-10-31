package main;

import composantsEmploye.IHMEmploye;
import composantsSalaire.IHMSalaire;

public class Main {
	 public static void main(String[] args) {
		
		        
		        IHMEmploye ihmEmploye = new IHMEmploye();
		        IHMSalaire ihmSalaire = new IHMSalaire();

		    
		        System.out.println("=== Gestion des Employés ===");
		        ihmEmploye.gererEmployes();

		      
		        System.out.println("=== Gestion des Salaires ===");
		        ihmSalaire.gererSalaires();
		    }

}
