/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
*idade for =-99. (WHILE)
*/

package br.com.generation.atividades;

import java.util.Scanner;

public class AtividadeWhile01 {

	public static void main(String[] args) {
		
		int idade=0, menosVinteUm=0, maisDeCinquenta=0;
		
		Scanner in = new Scanner(System.in); 		
		while(idade != -99) {
			System.out.println("Informe sua idade: ");
			idade= in.nextInt();
			
			if(idade < 21 && idade > 0) {
				menosVinteUm++;
			}
			if(idade > 50) {
				maisDeCinquenta++;
			}
			
		}
		System.out.println("O total de pessoas com mais de 21 anos é "+menosVinteUm+" e o de maiores de "
				+ " anos é " + maisDeCinquenta);
	}

}
