package br.com.generation.condicionais;

import java.util.Scanner;

public class LacoCondicional01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1,nota2, media, soma;
		
		System.out.println("Digite a 1� nota do Aluno: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a 2� nota do Aluno: ");
		nota2 = leia.nextDouble();
		
		media= (nota1+nota2)/2;
		
		if(media >= 6.0) {
			System.out.println("Parab�ns, Aluno Aprovado!"+"\nM�dia: "+ media);
		}
		else if(media >= 3.0 && media < 6.0){
			System.out.println("Recupera��o"+"\nM�dia: "+media);
		}
		else {
			System.out.println("Reprovado!"+"\nM�dia: "+media);
		}
	 }
}
