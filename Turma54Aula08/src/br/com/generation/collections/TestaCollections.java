package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1= "DBloco I - Java";
		String aula2= "Bloco II - Springboot";
		String aula3= "CBloco III - FrontEnd";
		String aula4= "ABloco IV - Mobile";
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);//---> [0]
		aulas.add(aula2);//---> [1]
		aulas.add(aula3);//---> [2]
		aulas.add(aula4);//---> [3]
		
		/*System.out.println(aulas);
		aulas.remove(1);
		System.out.println(aulas);*/
		
		//for --> each
		/*for(String i: aulas) {
			System.out.println("Aula: "+i);
		}*/
		
		/*String terceiraAula = aulas.get(2);
		
		System.out.println(terceiraAula);*/
		
		for(int i=0; i<aulas.size(); i++) {
			System.out.println("aula: "+aulas.get(i));
		}
		
		//System.out.println("Tamando do ArrayList: " + aulas.size());
		
		Collections.sort(aulas);// organiza a lista 
		//Collections.shuffle(aulas);// embaralha a lista
		System.out.println(aulas);
	}
}
