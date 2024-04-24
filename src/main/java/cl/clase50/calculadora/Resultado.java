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


public class Resultado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServicioCalculadora servicioCalculadora;

	public Resultado(){
		servicioCalculadora= new ServicioCalculadoraImpl();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1String= request.getParameter("num1");
		String num2String= request.getParameter("num2");
		String operacion= request.getParameter("operacion");
		
		int num1= Integer.parseInt(num1String);
		int num2= Integer.parseInt(num2String);
		
		int resultado=0;
		if(operacion.equals("suma")) {
			resultado= servicioCalculadora.sumar(num1, num2);
		}else {
			resultado= servicioCalculadora.restar(num1, num2);
		}
				
		
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		String html="<html>"+
						"<head>"+
							"<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">"+
				       "</head>"+
						"<body>"+
							"<div class=\"container\">"+
								"<div class=\"alert alert-success\" role=\"alert\">"+
									"<h1> El resultado es:"+
										resultado+
									"</h1>"+
								"</div>"+
							"</div>"+
						"</body>"+
					"</html>";
		out.println(html);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
