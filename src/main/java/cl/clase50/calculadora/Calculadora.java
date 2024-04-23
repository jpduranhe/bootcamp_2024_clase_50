package cl.clase50.calculadora;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Calculadora
 */
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		
		String html= """
				<html>
					<head>
						<title>Cacluladora</title>
					</head>
					<body>
						<h1>Calculadora</h1>											
						<form action="Resultado">
						<label>Nro 1</label>
						 <input type="text" name="num1"/>						 
						 <br/>
						 <label>Nro 2</label>
						 <input type="text" name="num2"/>
						 <br/>
						 <button type="submit"> Calcular</button>
						</form>
					</body>
				</html>
				""";
		out.println(html);
	}


}
