package Web;

public class CreditModel {

	private int montant;
	private int duree;
	private double taux;
	private double mensualit�;

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

	public double getMensualit�() {
		return mensualit�;
	}

	public void setMensualit�(double mensualit�) {
		this.mensualit� = mensualit�;
	}

	public CreditModel() {
		super();
	}

}
