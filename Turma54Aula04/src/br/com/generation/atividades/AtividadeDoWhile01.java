/*Crie um programa que leia um n�mero do teclado at� que encontre um
*n�mero igual a zero. No final, mostre a soma dos n�meros
*digitados.(DO...WHILE)
*/


package br.com.generation.atividades;

import java.util.Scanner;

public class AtividadeDoWhile01 {

	public static void main(String[] args) {
		
		int numeroTeclado,soma=0;
		
		Scanner digite = new Scanner(System.in);
		
		System.out.println("Digite um n�mero do teclado: ");
		soma=digite.nextInt();
		
		do {
			System.out.println("Digite mais um n�mero do teclado para continuar ou 0(zero) para sair: ");
			numeroTeclado = digite.nextInt();
			soma += numeroTeclado;
		}
		while(numeroTeclado!=0);
		
		System.out.println("A soma dos n�meros digitados �: "+soma);
		
	}
}
