package cl.clase50.calculadora.servicio;

public class ServicioCalculadoraImpl implements ServicioCalculadora {

	@Override
	public int sumar(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int restar(int num1, int num2) {
		return num1-num2;
	}

}
