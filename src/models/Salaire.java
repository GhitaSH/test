package models;

import java.util.Date;

public class Salaire {
	
		private int nunFiche;
		private Date dateFiche;
		private int nbHeure;
		private double tauxH;
		private double montantBrut;
		private double taxe;
		private double montantNet;
		private int idEmploye;
		public Salaire(int nunFiche, Date dateFiche, int nbHeure, double tauxH, double montantBrut, double taxe,
				double montantNet, int idEmploye) {
			super();
			this.nunFiche = nunFiche;
			this.dateFiche = dateFiche;
			this.nbHeure = nbHeure;
			this.tauxH = tauxH;
			this.montantBrut = montantBrut;
			this.taxe = taxe;
			this.montantNet = montantNet;
			this.idEmploye = idEmploye;
		}
		public int getNunFiche() {
			return nunFiche;
		}
		public void setNunFiche(int nunFiche) {
			this.nunFiche = nunFiche;
		}
		public Date getDateFiche() {
			return dateFiche;
		}
		public void setDateFiche(Date dateFiche) {
			this.dateFiche = dateFiche;
		}
		public int getNbHeure() {
			return nbHeure;
		}
		public void setNbHeure(int nbHeure) {
			this.nbHeure = nbHeure;
		}
		public double getTauxH() {
			return tauxH;
		}
		public void setTauxH(double tauxH) {
			this.tauxH = tauxH;
		}
		public double getMontantBrut() {
			return montantBrut;
		}
		public void setMontantBrut(double montantBrut) {
			this.montantBrut = montantBrut;
		}
		public double getTaxe() {
			return taxe;
		}
		public void setTaxe(double taxe) {
			this.taxe = taxe;
		}
		public double getMontantNet() {
			return montantNet;
		}
		public void setMontantNet(double montantNet) {
			this.montantNet = montantNet;
		}
		public int getIdEmploye() {
			return idEmploye;
		}
		public void setIdEmploye(int idEmploye) {
			this.idEmploye = idEmploye;
		} 
		
}
