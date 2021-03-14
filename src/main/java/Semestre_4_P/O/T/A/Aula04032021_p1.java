package Semestre_4_P.O.T.A;

/*
 * Solução 1: elabore um método chamado exibeMensagem que receba como
entrada uma cadeia de caracteres TEXTO e um número inteiro N e imprima
TEXTO em tela utilizando um laço de repetição que reproduza essa mensagem
N vezes. Esse método não deverá devolver nenhum valor de retorno.
 */

public class Aula04032021_p1 {

	public static void main(String[] args) {
		// int n = 4;
		exibeMensagem1("A Aula que eu goixxto ", 5);

	}

	// Solução com iteração
	public void exibeMensagem(String texto, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(texto);
		}
	}

	// Solução com recursão
	public static void exibeMensagem1(String texto, int n) {
		if (n > 0) {
			System.out.println(texto + n);
			exibeMensagem1(texto, n - 1);

		}

	}

}
