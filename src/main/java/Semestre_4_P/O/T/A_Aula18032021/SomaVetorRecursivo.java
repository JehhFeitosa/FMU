package Semestre_4_P.O.T.A_Aula18032021;

/*
 * Usando recurs�o, implemente um programa em Java que fa�a a soma de todos
os valores de um vetor de n�meros reais (float).
 */
public class SomaVetorRecursivo {

	public static void main(String[] args) {
		float[] v = {100,4,7,111,30,35};
		int tamanho = 5;
		System.out.println("O resultado da soma �: " +somaVetor(v, tamanho));
		
		//float soma = 0;
		//System.out.print( somaPosVetor(v, soma));
	}
	
	//Solu��o iterativa
	public static float somaPosVetor(float[] v, float soma) {
		for (int i = 0; i < v.length; i++) {
			soma = soma + v[i]; 
		}
		return soma;
	}
	

	//Solu��o Recursiva
	public static float somaVetor(float[] v, int tamanho) {
		if(tamanho==0) {
			return 0;
		}
		return v[tamanho - 1] + somaVetor( v, tamanho - 1);
	}
}
