/*
 * Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 * 
 */

package br.com.generation.atividades;

public class AtividadeFor1 {
	
	public static void main(String[] args) {
		
		int contador=0;
		for(int i=1000;i<=1999;i++) {
			if(i%11 == 5) {
			System.out.println(i);
			contador++;
			}
			
		}
		System.out.println("Existem "+contador+" numeros de 1000 a 1999 que quando divididos por 11 obtemos resto= 5");
	}
}
