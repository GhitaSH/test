package Services;

import java.util.List;

import models.Salaire;

public interface InterfaceGestionSalaire {
	void ajouterSalaire(Salaire salaire);
    void supprimerSalaire(int nunFiche);
    Salaire rechercherSalaire(int nunFiche);
    List<Salaire> listerSalaires();
}
