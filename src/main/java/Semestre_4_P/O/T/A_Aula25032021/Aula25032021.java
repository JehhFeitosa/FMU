package Semestre_4_P.O.T.A_Aula25032021;

import java.util.Iterator;

public class Aula25032021 {

	public static void main(String[] args) {
		int[] n = {1, 5, 6, 7, 5};
		System.out.println(maior(n));

	}

	public static int maior(int[] v) {
		int maior;
		maior = v[0];

		for (int i = 0; i < v.length; i++) {
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		return maior;

	}
}
