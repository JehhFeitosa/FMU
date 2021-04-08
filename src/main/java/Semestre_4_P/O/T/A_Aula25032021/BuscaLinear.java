package Semestre_4_P.O.T.A_Aula25032021;

public class BuscaLinear {

	/*
	 * Função buscaLinear(V[0, ..., N]: vetor, T: inteiro) : inteiro
		Início
			Para i de 0 até N passo 1 Faça
				Se V[i] = T Então
					Devolve i
				Fim-se
			Fim-para
			Devolve -1
		Fim
	 */
	public static void main(String[] args) {

		int[] v = {1, 5, 6, 7, 19, 9, 11, 18, 20, 4};
		int t = 21; 
		System.out.println("Posição do vetor: "+buscaLinear(v, t));
	}
	
	public static int buscaLinear(int v[], int t) {               //Medindo tempo de execução
		                                                          //Melhor Caso(t = valor da primeira posição do array) 
		                                                          //vs Pior Caso(onde o valor de t não existe no vetor)    
		for (int i = 0; i < t; i++) {                             //c1 = 1 vs c1 = N
			if(v[i] == t) {                                       //c2 = 1 vs c2 = N
				System.out.println("Valor procurado: " + t);
				return i;                                         //c3 = 1 vs c3 = O
			}else {
				System.out.println("Valor não localizado no vetor."); // c4 = 0 vs c4 = 1
				return -1;
			}
		}
		
		return -1;                                                
		
	}

}
