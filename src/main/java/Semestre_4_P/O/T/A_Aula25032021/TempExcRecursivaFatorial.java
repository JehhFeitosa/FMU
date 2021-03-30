package Semestre_4_P.O.T.A_Aula25032021;

public class TempExcRecursivaFatorial {

	/*
	 * Procedimento fatorial(N: inteiro) : inteiro
		Início
			Se N <= 1 Então
				Devolve 1
			Fim-se
			Devolve N * fatorial(N – 1)
		Fim
	 */
	
	public static void main(String[] args) {

		System.out.println(fatorial(5));
	}
	
	public static int fatorial(int n) {                              //medindo tempo de execução
		
		if(n<=1) {                                                   // c1 N
			return 1;                                                // c2 1
		}
		return n * fatorial(n-1);                                    // c3 n-1
		//System.out.println(n * fatorial(n-1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int fatorial1(int n){
		if(n <=1) {
			return 1;
		}
		return  n * fatorial1(n - 1);
		}
	
	

}
