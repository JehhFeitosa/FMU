package Semestre_4_P.O.T.A;
/*
 * Usando recursão, implemente um programa em Java que faça a soma de todos
os valores de um vetor de números reais (float).

Entrada:
1.5, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0

Saída: 55.5

 */
public class Exer2_Aula11032021 {

	public static void main(String[] args) {
		float[] v = {100,4,7,111,30,35};
		int tamanho = 5;
		//somaIterativa(v, soma);
		soma(v, tamanho);
		 System.out.println(soma(v, tamanho));
	}
	
	//Solução iterativa
	public static void somaIterativa(int[] v, int soma) {

		for (int i = 0; i < v.length; i++) {
			soma = soma + v[i];
		}
		System.out.println("Total: "+soma);
	}
	
//	public void somaRecursiva(int[] v, int soma) {
//		int tamVetor = v.length;
//		int tam2 = tamVetor -1
//		int valueVetor = tam2 -
//		if (v.length > 0) {
//			soma = soma + SomaRecursiva(v. - 1, soma);
//			
//			//return SomaRecursiva(v - 1, soma)
//
//		}
	
	public static float soma(float v[], int tamanho) {
        if (tamanho == 0) {
            return 0;
        }
      //  float result;
		return v[tamanho - 1] + soma(v, tamanho - 1);
       
    }
		

}

