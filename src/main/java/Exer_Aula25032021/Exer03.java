package Exer_Aula25032021;

import java.util.Scanner;

public class Exer03 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int[] v = { 1, 5, 6, 7, 19, 9, 11, 18, 20, 4 };
		int posVetor = 0;

		System.out.println("Digite um número para busca no vetor.");
		int t = scan.nextInt();

		System.out.println("A posição do vetor é: " + linearRecursiva(v, t, posVetor));
	}

	public static int linearRecursiva(int v[], int t, int posvetor) {

		if (posvetor >= v.length) {
			return -1;
		} else if (v[posvetor] == t) {
			return posvetor;
		} else {
			return linearRecursiva(v, t, posvetor + 1);
		}
	}
}
