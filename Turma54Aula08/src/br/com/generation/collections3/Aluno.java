package br.com.generation.collections3;

public class Aluno {

	private int idade;
	private String nome;

	public Aluno(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override //---> sobreescrita de metodo - o mesmo que polimorfismo
	public String toString() { //---> toString é usado quando tem duas ou mais variaveis diferentes.
		return "Idade do aluno: " + idade + "\nNome do aluno: " + nome;
	}
	
	
	
}
