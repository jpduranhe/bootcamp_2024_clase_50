package cl.clase50.calculadora;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		
		String html= """
				<html>
					<head>
						<title>Cacluladora</title>
						<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
					</head>
					<body>
						<div class="container">
						
						<h1>Calculadora</h1>											
						<form action="Resultado">
						<label>Nro 1</label>
						 <input class="form-control" type="text" name="num1"/>						 
						 <br/>
						 <label>Nro 2</label>
						 <input class="form-control" type="text" name="num2"/>
						 <br/>
						 <label>Operación</label>
						 <select class="form-control" name="operacion">
				                     <option value="suma">Sumar</option>
				                     <option value="resta" selected>Restar</option>
                         </select>
                          <br/>
						 <button class="btn btn-primary" type="submit"> Calcular</button>
						</form>
						</div>
					</body>
				</html>
				""";
		out.println(html);
	}



	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}


}
