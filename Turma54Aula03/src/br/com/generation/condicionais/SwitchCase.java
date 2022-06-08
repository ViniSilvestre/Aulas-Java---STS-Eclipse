package br.com.generation.condicionais;

import java.util.Scanner;

public class SwitchCase {
			//escolha - caso
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in); //ctrl+shift+O importa a biblio
		
		System.out.println("Escreva uma letra: ");
		char letra = entrada.next().charAt(0);
				
		switch(letra) {
			case 'a','A':
				System.out.println("Annie");
			break;
			case 'f','F':
				System.out.println("Felipe");
			break;
			default:
				System.out.println("Opção Inválida!");
			break;			
			
		}
	}

}
