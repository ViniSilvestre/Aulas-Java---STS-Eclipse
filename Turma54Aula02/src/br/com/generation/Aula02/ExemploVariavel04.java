package br.com.generation.Aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		
		//escreva---> mostra para o usuario textos junto com variaveis. -->sysout
		//leia -----> recebe no console um valor digitado pelo usuario ---> import de uma biblioteca(Scanner)
		Scanner leia = new Scanner(System.in);	
	
		double a, b, soma;
		
		System.out.println("Digite o valor de A: ");
		a=leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b=leia.nextDouble();
		
		soma=a+b;
		
		System.out.println("O resultado da soma ?: "+soma);
		
	}

}
