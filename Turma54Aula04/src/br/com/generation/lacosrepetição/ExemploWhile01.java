package br.com.generation.lacosrepeti��o;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10) {
			
			System.out.println("Repeti��o: "+contador);
		
			contador++;
			Thread.sleep(500);
		
		}
	}
}
