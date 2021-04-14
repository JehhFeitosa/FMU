package Exer_Aula25032021;

import java.util.Scanner;

/*
 * Versão Recursiva
 * da Busca Binária
 */
public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] v = { 1, 5, 6, 7, 9, 11, 18, 20 };

		System.out.println("Digite um número para busca no array.");
		int t = scan.nextInt();

		System.out.println("Posição do vetor: " + buscaBinariaRecursiva(v, t, 0, v.length -1));
	}

	public static int buscaBinariaRecursiva(int v[], int t, int ini, int fim) {
		int pivo = (ini + fim) / 2;

		if (ini > fim) {
			return -1;
		} else if (v[pivo] == t) {
			return pivo;
		} else if (v[pivo] < t) {
			ini = pivo + 1;
			return buscaBinariaRecursiva(v, t, ini, fim);
		} else {
			fim = pivo - 1;
			return buscaBinariaRecursiva(v, t, ini, fim);
		}

	}

}
