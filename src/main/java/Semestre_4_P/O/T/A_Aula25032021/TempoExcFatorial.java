package Semestre_4_P.O.T.A_Aula25032021;

public class TempoExcFatorial {

	/*
	 * Tempo de execu��o de um fatorial
	 * 
	 * Procedimento fatorial(N: inteiro) : inteiro
	   In�cio
			fatorial: inteiro
			fatorial = 1
			Para i de 1 at� N passo 1 Fa�a
					fatorial = fatorial * i
			Fim-para
			Devolve fatorial
		Fim
	 */
	public static void main(String[] args) {
		System.out.println(fatorial(5));
		
	}
	
	public static int fatorial(int n) {                              //medindo tempo de execu��o
		int fatorial = 1;                                             //c1 1x
		
		for (int i = 1; i < n; i++) {                                 //c2 n+1
			System.out.println(fatorial = fatorial + fatorial * 1);   //c3 n
		}
				
		return fatorial;                                              //c4  1
		
	}
	

}
