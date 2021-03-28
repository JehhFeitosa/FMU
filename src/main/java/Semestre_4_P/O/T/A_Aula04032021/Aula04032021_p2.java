package Semestre_4_P.O.T.A_Aula04032021;

/*
 * Solução 1: elabore um método chamado fatorial que receba como
entrada um número inteiro N e multiplique o valor de N sucessivamente
por seu antecessor até que o valor antecessor seja igual a 1.
 */
public class Aula04032021_p2 {

	public static void main(String[] args) {
		fatorial1(5);

	}
	
	//Resolução Iterativa
	public static int fatorial(int n){
		int fatorial = 1;
		for (int i = 1; i <= n; i++){
		fatorial = fatorial * i;
		}
		return fatorial;
		}
	
	//Resolução Recursiva
	public static int fatorial1(int n){
		if(n <=1) {
			return 1;
		}
		return  n * fatorial1(n - 1);
		}

}
