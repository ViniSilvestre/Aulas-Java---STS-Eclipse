package br.com.generation.Aula02;

import java.util.Scanner;

public class ExercicioVariavel03 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		double galoes,litros, multiplicacao;
		litros = 3.7854;
		
		System.out.println("Digite o n?mero de gal?es: ");
		galoes=leia.nextDouble();
		
		multiplicacao = galoes * litros;
		
		System.out.println("A quantidade total de litros fica em: "+multiplicacao);
		
		
		

	}

}
