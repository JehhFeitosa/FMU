package Exer_Aula25032021;

import java.util.Scanner;

/*
 * Busca binária 
 * para a estrutura
 *  de dados vetor.
 */
public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] v = { 1, 5, 6, 7, 9, 11, 18, 20 };

		System.out.println("Digite um número para busca no array.");
		int t = scan.nextInt();

		System.out.println("Posição do vetor: " + buscaBinaria(v, t));
	}

	public static int buscaBinaria(int v[], int t) {

		int ini, fim, pivo;
		ini = 0;
		fim = v.length;

		while (ini < fim) {
			pivo = (ini + fim) / 2;
			if (v[pivo] == t) {
				return pivo;
			} else {
				if (v[pivo] < t) {
					ini = pivo + 1;
				} else {
					fim = pivo - 1;
				}
			}
		}

		return -1;

	}

}
