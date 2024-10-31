package Services;

import java.util.ArrayList;
import java.util.List;

import models.Employe;

public class GestionEmploye implements InterfaceGestionEmploye{
	 private ArrayList<Employe> employes = new ArrayList<>();
	 public GestionEmploye() {
	        employes = new ArrayList<>();
	        
	        // Pre-populate the list with sample employees
	        employes.add(new Employe("Ghita", "Slaoui", "001", "Fes"));
	        employes.add(new Employe("Hind", "Beryoullat", "002", "Fes"));
	        employes.add(new Employe("Driss", "Alami", "003", "Fes"));
	    }
	  
	    
	    
	    @Override
	    public void supprimerEmploye(String matricule) {
	        Employe employe = rechercherEmploye(matricule);
	        if (employe != null) {
	            employes.remove(employe);
	            System.out.println("Employee removed: " + employe.getNom() + " " + employe.getPrenom());
	        } else {
	            System.out.println("Employee not found.");
	        }
	    }
	    @Override
	    public Employe rechercherEmploye(String matricule) {
	        for (Employe e : employes) {
	            if (e.getMatricule().equals(matricule)) {
	                return e;
	            }
	        }
	        return null;
	    }
	    @Override
	    public void ajouterEmploye(Employe e) {
	        
	        if (rechercherEmploye(e.getMatricule()) != null) {
	            System.out.println("Employee with matricule " + e.getMatricule() + " already exists.");
	        } else {
	            employes.add(e);
	            System.out.println("Employee added: " + e.getNom() + " " + e.getPrenom());
	        }
	    }
	    @Override
	    public List<Employe> listerEmployes() {
	        return employes;
	    }
	   

	    

}
