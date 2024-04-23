package cl.clase50.calculadora;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import cl.clase50.calculadora.servicio.ServicioCalculadora;
import cl.clase50.calculadora.servicio.ServicioCalculadoraImpl;

/**
 * Servlet implementation class Resultado
 */
public class Resultado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServicioCalculadora servicioCalculadora;

	public Resultado(){
		servicioCalculadora= new ServicioCalculadoraImpl();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1String= request.getParameter("num1");
		String num2String= request.getParameter("num2");
		
		int num1= Integer.parseInt(num1String);
		int num2= Integer.parseInt(num2String);
		
		int resultado=servicioCalculadora.sumar(num1, num2);
		
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		/*
		String html= """
				<html>
					<head>
						<title>Cacluladora</title>
					</head>
					<body>
						<h1>Calculadora</h1>											
						<h1>Calculadora</h1>
					</body>
				</html>
				""";
		*/
		String html="<html>"+
					"<body>"+
					"<h1> El resultado es:"+
					resultado+
					"</h1>"+
					"</body>"+
					"</html>";
		out.println(html);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
