package Services;

import java.util.ArrayList;
import java.util.List;

import models.Salaire;

public class GestionSalaire implements InterfaceGestionSalaire{
	 private ArrayList<Salaire> salaires = new ArrayList<>();

	    @Override
	    public void ajouterSalaire(Salaire salaire) {
	        salaires.add(salaire);
	        System.out.println("Salary added: Fiche " + salaire.getNunFiche());
	    }

	    @Override
	    public void supprimerSalaire(int nunFiche) {
	        Salaire salaire = rechercherSalaire(nunFiche);
	        if (salaire != null) {
	            salaires.remove(salaire);
	            System.out.println("Salary removed: Fiche " + salaire.getNunFiche());
	        } else {
	            System.out.println("Salary not found.");
	        }
	    }

	    @Override
	    public Salaire rechercherSalaire(int nunFiche) {
	        for (Salaire s : salaires) {
	            if (s.getNunFiche() == nunFiche) {
	                return s;
	            }
	        }
	        return null;
	    }

	    @Override
	    public List<Salaire> listerSalaires() {
	        return salaires; // return the list of salaries
	    }
}
