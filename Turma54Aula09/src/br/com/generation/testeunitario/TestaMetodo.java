package br.com.generation.testeunitario;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
			
		int resultadoEsperado = 4;
		
		double resultado = calc.soma(2, 2.5);
		
		if(resultado == resultadoEsperado) {
			System.out.println("TESTE OK!");
		}
		else {
			System.out.println("TESTE FALHOU!");
		}
	}
}
