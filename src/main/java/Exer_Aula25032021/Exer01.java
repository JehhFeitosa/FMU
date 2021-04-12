package Exer_Aula25032021;

import java.util.Scanner;

/*
 * Busca linear
 *  para a estrutura
 *  de dados vetor.
 */
public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] v = { 1, 5, 6, 7, 19, 9, 11, 18, 20, 4 };

		System.out.println("Digite um número para busca no array.");
		int t = scan.nextInt();

		System.out.println("A posição do vetor: " + buscaLinear(v, t));
	}

	public static int buscaLinear(int v[], int t) {
		int tamVetor = v.length;
		for (int i = 0; i < tamVetor; i++) {
			if (v[i] == t) {
				return i;
			} 
		}
		return -1;
	}
	
	
	
}
