/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
*/

package br.com.generation.atividades;

import java.util.Scanner;

public class AtividadeWhile02 {

	public static void main(String[] args) {
		
		 int idade=0, personalidade=0, sexo=0, i=0, Masculino=0, Feminino=0, Outros=0, calmo=0, nervoso=0, agressivo=0, mulheresnervosas=0;
		int homensagressivos=0, outroscalmos=0, maisquarenta=0, menosdezoito=0;		
		
		Scanner sc = new Scanner(System.in);
				
		while(i<150) {
			
			System.out.println("--Informe sua idade: ");
			idade = sc.nextInt();
			System.out.println("--Informe seu gênero:\n 1- Masculino | 2- Feminino | 3- Outros");
			sexo = sc.nextInt();
			switch(sexo) {
				case 1: 
					Masculino++;
					break;
				case 2:
					Feminino++;
					break;
				case 3:
					Outros++;
					break;
			}
			System.out.println("--Qual seu tipo de personalidade?:\n1- Calmo | 2 - Nervoso | 3- Agressivo");
			personalidade = sc.nextInt();
			if(personalidade == 1) {
				calmo++;
			}
			if(personalidade == 2) {
				nervoso++;
			}
			if(personalidade == 3) {
				agressivo++;
			}
			if(sexo == 2 && personalidade == 2) {
				mulheresnervosas++;
			}
			if(sexo == 1 && personalidade == 3) {
				homensagressivos++;
			}
			if(sexo == 3 && personalidade == 1) {
				outroscalmos++;
			}
			if(idade > 40 && personalidade == 2) {
				maisquarenta++;
			}
			if(idade < 18 && personalidade == 3) {
				menosdezoito++;
			}
			i++;
	}
		
		System.out.println("o número de pessoas calmas: "+calmo+"\r\n"
				+ "número de mulheres nervosas: "+mulheresnervosas+"\r\n"
				+ "número de homens agressivos: "+homensagressivos+"\r\n"
				+ "número de outros calmos: "+outroscalmos+ "\r\n"
				+ "número de pessoas nervosas com mais de 40 anos "+maisquarenta+"\r\n"
				+ "número de pessoas calmas com menos de 18 anos: "+menosdezoito);
}
	
}