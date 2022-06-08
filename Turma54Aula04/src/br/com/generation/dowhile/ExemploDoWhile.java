package br.com.generation.dowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		
		int i=0, j=0;
		
		do {
			System.out.println(++i);
			System.out.println(j++);
			Thread.sleep(500); //thread.sleep = temporizador! necessario ter o throws ali de cima.
		}while(i<=7);
	}
}
