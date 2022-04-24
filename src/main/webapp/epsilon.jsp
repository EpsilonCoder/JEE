<%@page import="Web.CreditModel"%>
<%
CreditModel mod = (CreditModel) request.getAttribute("mod");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>credit</title>
<link rel="stylesheet" type="type/css"
	href="<%=request.getContextPath()%>/css/style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body bgcolor="grey">
	<div class="container mx-auto ">
	
	
		<table class="table table-dark table-striped">
			<tr>
				<td>Similateur de Crédit</td>
			</tr>
		</table>
		
		<form action="controleur" method="POST">

			<table class="table">
			
				<tbody>
					<tr class="table-secondary">
						<td>Montant :</td>
						<td><input type="text" name="montant"
							value="<%=mod.getMontant()%>" class="form-control"
							class="form-control" /></td>
					</tr>
					<tr class="table-success">
						<td>durée :</td>
						<td><input type="text" name="duree"
							value="<%=mod.getTaux()%>" class="form-control" /></td>
					</tr>
					<tr class="table-info">
						<td>Taux :</td>
						<td><input type="text" name="taux" value=<%=mod.getTaux()%>
							class="form-control" /></td>
					</tr>

					<tr>
						<td><input type="submit" name="montant"
							class="btn btn-success" value="Calculer" /></td>
					</tr>
				</tbody>
			</table>
		</form>


		<table class="table table-dark table-striped">
			<tr>
				<td>Mensulaité  ====> <%=mod.getMensualité()%></td>
			</tr>
		</table>
	</div>

</body>
</html>