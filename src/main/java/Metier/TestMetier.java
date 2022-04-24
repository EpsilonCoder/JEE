package Metier;

public class TestMetier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditMetier metier=new CreditMetier();
		double m=metier.calculMensualite(200000, 240, 4.5);
		System.out.println(m);

	}

}
