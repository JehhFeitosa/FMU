package Semestre_4_P.O.T.A;

/*
 * Solu��o 1: elabore um m�todo chamado exibeMensagem que receba como
entrada uma cadeia de caracteres TEXTO e um n�mero inteiro N e imprima
TEXTO em tela utilizando um la�o de repeti��o que reproduza essa mensagem
N vezes. Esse m�todo n�o dever� devolver nenhum valor de retorno.
 */

public class Aula04032021_p1 {

	public static void main(String[] args) {
		// int n = 4;
		exibeMensagem1("A Aula que eu goixxto ", 5);

	}

	// Solu��o com itera��o
	public void exibeMensagem(String texto, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(texto);
		}
	}

	// Solu��o com recurs�o
	public static void exibeMensagem1(String texto, int n) {
		if (n > 0) {
			System.out.println(texto + n);
			exibeMensagem1(texto, n - 1);

		}

	}

}
