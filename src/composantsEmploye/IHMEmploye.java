package composantsEmploye;

import java.util.Scanner;

import Services.GestionEmploye;
import models.Employe;

public class IHMEmploye {
	
	 private GestionEmploye gestionEmploye = new GestionEmploye();
	    private Scanner scanner = new Scanner(System.in);

	    public void afficherMenu() {
	        System.out.println("1. Ajouter un employé");
	        System.out.println("2. Supprimer un employé");
	        System.out.println("3. Rechercher un employé");
	        System.out.println("4. Lister les employés");
	        System.out.println("5. Quitter");
	    }
	    public void gererEmployes() {
	        int choix = 0;
	        do {
	            afficherMenu();
	            choix = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choix) {
	                case 1:
	                    ajouterEmploye();
	                    break;
	                case 2:
	                    supprimerEmploye();
	                    break;
	                case 3:
	                    rechercherEmploye();
	                    break;
	                case 4:
	                    listerEmployes();
	                    break;
	                case 5:
	                    System.out.println("Sortie du programme.");
	                    break;
	                default:
	                    System.out.println("Choix invalide.");
	            }
	        } while (choix != 5);
	    }

	    private void ajouterEmploye() {
	        System.out.print("Nom: ");
	        String nom = scanner.nextLine();
	        System.out.print("Prénom: ");
	        String prenom = scanner.nextLine();
	        System.out.print("Matricule: ");
	        String matricule = scanner.nextLine();
	        System.out.print("Adresse: ");
	        String adresse = scanner.nextLine();

	        Employe employe = new Employe(nom, prenom, matricule, adresse);
	        gestionEmploye.ajouterEmploye(employe);
	    }

	    private void supprimerEmploye() {
	        System.out.print("Matricule de l'employé à supprimer: ");
	        String matricule = scanner.nextLine();
	        gestionEmploye.supprimerEmploye(matricule);
	    }

	    private void rechercherEmploye() {
	        System.out.print("Matricule de l'employé à rechercher: ");
	        String matricule = scanner.nextLine();
	        Employe employe = gestionEmploye.rechercherEmploye(matricule);
	        if (employe != null) {
	            System.out.println("Employé trouvé: " + employe.getNom() + " " + employe.getPrenom());
	        } else {
	            System.out.println("Aucun employé trouvé.");
	        }
	    }

	    private void listerEmployes() {
	        System.out.println("Liste des employés:");
	        for (Employe e : gestionEmploye.listerEmployes()) {
	            System.out.println(e.getNom() + " " + e.getPrenom() + " - Matricule: " + e.getMatricule());
	        }
	    }
	}
