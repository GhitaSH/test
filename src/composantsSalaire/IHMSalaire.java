package composantsSalaire;

import java.util.Scanner;

import Services.GestionSalaire;
import models.Salaire;
import java.util.Date;

public class IHMSalaire {
	 private GestionSalaire gestionSalaire = new GestionSalaire();
	    private Scanner scanner = new Scanner(System.in);

	    public void afficherMenu() {
	        System.out.println("1. Ajouter un salaire");
	        System.out.println("2. Supprimer un salaire");
	        System.out.println("3. Rechercher un salaire");
	        System.out.println("4. Lister les salaires");
	        System.out.println("5. Quitter");
	    }

	    public void gererSalaires() {
	        int choix = 0;
	        do {
	            afficherMenu();
	            choix = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choix) {
	                case 1:
	                    ajouterSalaire();
	                    break;
	                case 2:
	                    supprimerSalaire();
	                    break;
	                case 3:
	                    rechercherSalaire();
	                    break;
	                case 4:
	                    listerSalaires();
	                    break;
	                case 5:
	                    System.out.println("Sortie du programme.");
	                    break;
	                default:
	                    System.out.println("Choix invalide.");
	            }
	        } while (choix != 5);
	    }

	    private void ajouterSalaire() {
	        System.out.print("Numéro de fiche: ");
	        int nunFiche = scanner.nextInt();
	        System.out.print("Date de la fiche (en millisecondes): ");
	        Date dateFiche = new Date(scanner.nextLong());
	        System.out.print("Nombre d'heures: ");
	        int nbHeure = scanner.nextInt();
	        System.out.print("Taux horaire: ");
	        double tauxH = scanner.nextDouble();
	        double montantBrut = nbHeure * tauxH;
	        double taxe = montantBrut * 0.2; // 20% tax
	        double montantNet = montantBrut - taxe;
	        System.out.print("ID Employé: ");
	        int idEmploye = scanner.nextInt();

	        Salaire salaire = new Salaire(nunFiche, dateFiche, nbHeure, tauxH, montantBrut, taxe, montantNet, idEmploye);
	        gestionSalaire.ajouterSalaire(salaire);
	    }

	    private void supprimerSalaire() {
	        System.out.print("Numéro de fiche à supprimer: ");
	        int nunFiche = scanner.nextInt();
	        gestionSalaire.supprimerSalaire(nunFiche);
	    }

	    private void rechercherSalaire() {
	        System.out.print("Numéro de fiche à rechercher: ");
	        int nunFiche = scanner.nextInt();
	        Salaire salaire = gestionSalaire.rechercherSalaire(nunFiche);
	        if (salaire != null) {
	            System.out.println("Salaire trouvé: Fiche " + salaire.getNunFiche() + ", Montant Net: " + salaire.getMontantNet());
	        } else {
	            System.out.println("Aucun salaire trouvé.");
	        }
	    }

	    private void listerSalaires() {
	        System.out.println("Liste des salaires:");
	        for (Salaire s : gestionSalaire.listerSalaires()) {
	            System.out.println("Fiche " + s.getNunFiche() + ", Montant Net: " + s.getMontantNet());
	        }
	    }
}
