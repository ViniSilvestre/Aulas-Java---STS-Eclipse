//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package br.com.generation.atividades;

import java.util.Scanner;

public class AtividadeFor02 {

	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);//n = ler.nextInt();
		
		int par=0,impar=0;
		
		for(int n=1;n<=10;n++) {
			
			if(n % 2 == 0) {
				par++;
			}
			if(n % 2 != 0) {
				impar++;
			}
			System.out.println("Digite um numero de 0 a 10: ");
			n = ler.nextInt();
		}
		System.out.println("A quantidade de numeros pares �: " + par);
		System.out.println("A quantidade de nummeros impares �: "+impar);
	}
}
