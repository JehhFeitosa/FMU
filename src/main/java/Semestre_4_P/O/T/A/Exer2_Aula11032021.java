package Semestre_4_P.O.T.A;

/*
 * Considere o programa abaixo para encontrar o maior valor em um vetor de números
inteiros. Escreva em Java uma solução recursiva objetivando a mesma solução.
 */
public class Exer2_Aula11032021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//iteração
	public int maiorValor(int[] v, int tamanho){
		int maior = v[0];
		for (int i = 1; i < tamanho; i++) {
		if (maior < v[i]) {
		maior = v[i];
		}
		}
		return maior;
		}


}
