package Web;

public class CreditModel {

	private int montant;
	private int duree;
	private double taux;
	private double mensualité;

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double getMensualité() {
		return mensualité;
	}

	public void setMensualité(double mensualité) {
		this.mensualité = mensualité;
	}

	public CreditModel() {
		super();
	}

}
