package Semestre_4_P.O.T.A_Aula29042021;

public class AppOrdenacao {

	public static void main(String[] args) {
		int[] v = new int[100];
		
		//Gera um vetor aleatorio
		for(int i = 0; i < 100; i++) {
			v[i] = geraNumero();
			
		}
		long ini = System.currentTimeMillis();
		bubbleSort(v, v.length);
		long fim = System.currentTimeMillis();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(v[i]);
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("Tempo: " + (fim - ini) + "ms");
	}
	
	
	public static void bubbleSort(int[]v , int n) {
		int aux;
		for(int i = 0; i<n; i++) {
			for (int j = i; j< n; j++) {
				if (v[j] < v[i]) {
					//Troca
					aux = v[j];
					v[j]= v[i];
					v[i] = aux;
				}
			}
		}
	}

}
