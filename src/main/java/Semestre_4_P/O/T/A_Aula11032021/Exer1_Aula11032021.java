package Semestre_4_P.O.T.A_Aula11032021;
/*
 * Considere o programa abaixo para encontrar o maior valor em um vetor de números
inteiros. Escreva em Java uma solução recursiva objetivando a mesma solução.
 */
public class Exer1_Aula11032021 {

	public static void main(String[] args) {

		int[] v = {100,4,7,111,30,35};
		int maior = maiorValor1(v, v.length);
		System.out.println("Maior valor = " + maior);
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

	public static int maiorValor1(int[] v, int tamanho) {
		if(tamanho == 1) {
			return v[0];
		} else{
			int maior = maiorValor1(v, tamanho - 1);
			if(maior > v[tamanho - 1]) {
				return maior;				
			}
			return v[tamanho - 1];
		}
	}

}