package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelaAmigavel {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		//Integer faz manipula��o de numeros inteiros
		if(numero % 4 == 0 && numero % 5 == 0) {//&&= e (condi��o) /%= resto da divis�o de um numero/= == igual mesmo (operadores relacionais)
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � divisivel por 4 e 5");
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" n�o � divisivel por 4 e 5");

		}
	}

}
