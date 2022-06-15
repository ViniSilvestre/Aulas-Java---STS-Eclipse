package br.com.generation.collections2;

public class Aula {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	//polimorfismo
	public String toString() {
		return "Titulo: "+this.titulo + " | " + this.tempo + " minutos.";
				
	}

}
