package br.com.generation.Aula02;

import java.util.Scanner;

public class ExercicioVariavel04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		
		double a, b, soma, subtracao, multiplicacao, divisao;
		
		System.out.println("Digite o valor de A: ");
		a=leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b=leia.nextDouble();
		
		soma=a+b;
		subtracao=a-b;
		multiplicacao=a*b;
		divisao=a/b;
		
		System.out.println("O resultado da soma �: "+soma);
		System.out.println("O resultado da subtra��o �: "+subtracao);
		System.out.println("O resultado da multiplica��o �: "+multiplicacao);
		System.out.println("O resultado da divis�o �: "+divisao);
		
	}
}
