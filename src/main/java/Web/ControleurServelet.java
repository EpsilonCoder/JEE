package Web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Metier.CreditMetier;

@WebServlet("/controleur")
public class ControleurServelet extends HttpServlet {
	
	private CreditMetier metier;
	
	
	@Override
	public void init() throws ServletException {
		metier=new CreditMetier();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mod",new CreditModel());
		request.getRequestDispatcher("epsilon.jsp").forward(request, response);
		
	}
	
	@Override
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int montant=Integer.parseInt(request.getParameter("montant"));
		int duree=Integer.parseInt(request.getParameter("duree"));
		double taux=Double.parseDouble(request.getParameter("taux"));
		CreditModel model=new CreditModel();
		model.setMontant(montant);
		model.setDuree(duree);
		model.setTaux(taux);
		
		double res=metier.calculMensualite(montant, duree, taux);
		model.setMensualité(res);
		request.setAttribute("mod", model);
		request.getRequestDispatcher("epsilon.jsp").forward(request, response);
	}

}
