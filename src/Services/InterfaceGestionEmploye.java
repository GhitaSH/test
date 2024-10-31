package Services;

import java.util.List;

import models.Employe;

public interface InterfaceGestionEmploye {
	 void ajouterEmploye(Employe e);
	    void supprimerEmploye(String matricule);
	    Employe rechercherEmploye(String matricule);
	    List<Employe> listerEmployes();
}
