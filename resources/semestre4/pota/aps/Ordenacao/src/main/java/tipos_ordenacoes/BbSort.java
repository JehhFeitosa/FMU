package tipos_ordenacoes;

public class BbSort {
	
	public static void bubbleSort(int[] v, int n) {
		int aux;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (v[j] < v[i]) {
					// Troca
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
				}
			}
		}
	}

	public static void bubbleSort2(int[] v, int n) {
		int aux;
		boolean trocou = true;
		for (int i = n - 1; i > 0 && trocou; i--) {
			trocou = false;
			for (int j = 0; j < i; j++) {
				if (v[j] > v[j + 1]) {
					troca(v, j, j + 1);
					// Ou use o método acima
					// Ou use o código comentado abaixo
					// aux = v[j];
					// v[j] = v[j + 1];
					// v[j + 1] = aux;
					trocou = true;
				}
			}
		}
	}

	public static void troca(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}


}
