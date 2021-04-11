package Semestre_4_P.O.T.A_Aula25032021;

public class BuscaBinaria {

	/*
	 * Função buscaBinaria(V[0, ..., N]: vetor, T: inteiro) : inteiro
	   Início
			ini, fim, pivo: inteiro
			ini = 0
			fim = tamanho{V}
			Enquanto ini ≤ fim Então
					pivo = ⎣ (ini + fim) / 2 ⎦
					Se V[pivo] = T Então
						Devolve pivo
					Senão
							Se V[pivo] < T Então
									ini = pivo + 1
							Senão
									fim = pivo – 1
							Fim-se
				    Fim-se
			Fim-enquanto
			Devolve -1	
		Fim
	 */
	public static void main(String[] args) {
		int[] v = {1, 5, 6, 7, 9, 11, 18, 20};
		int t = 5; 
		System.out.println("Posição do vetor: "+buscaBinaria(v, t));
	}
	
	public static int buscaBinaria(int v[], int t) {
		
		int ini, fim, pivo;
		ini = 0;
		fim = v.length;
		
		while(ini < fim) {
			pivo = (ini + fim)/ 2;
			if(v[pivo] == t) {
				return pivo;
			}else {
				if(v[pivo] < t) {
					ini = pivo + 1;
				}else {
					fim = pivo - 1;
				}
			}
		}
		
		return -1;
		
		
	}

}
