package br.com.generation.forr;

import java.util.Scanner;

public class ExemploFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Giros: ");
		int n = sc.nextInt(); //declaração de variavel n com o valor 10 dentro dela.
		int i, soma;
		
		soma = sc.nextInt();
		
		for(i = 0; i <= n; i++) {
			System.out.printf("Soma: "+soma+" + "+i);
			soma+=i;//mesma coisa que /soma = soma + 1.
			System.out.println(" = "+soma);
		}

	}

}
