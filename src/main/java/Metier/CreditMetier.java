package Metier;

public class CreditMetier {
	
	public double calculMensualite(int c,int duree,double taux) {
		double t=taux/100;
		double t1=c*taux/12;
		double t2=1-Math.pow(1+t/12, -duree);
		
		return t1/t2;
		
		
	}

}
