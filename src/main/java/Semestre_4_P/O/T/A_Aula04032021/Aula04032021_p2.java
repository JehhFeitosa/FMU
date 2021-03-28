package Semestre_4_P.O.T.A_Aula04032021;

/*
 * Solu��o 1: elabore um m�todo chamado fatorial que receba como
entrada um n�mero inteiro N e multiplique o valor de N sucessivamente
por seu antecessor at� que o valor antecessor seja igual a 1.
 */
public class Aula04032021_p2 {

	public static void main(String[] args) {
		fatorial1(5);

	}
	
	//Resolu��o Iterativa
	public static int fatorial(int n){
		int fatorial = 1;
		for (int i = 1; i <= n; i++){
		fatorial = fatorial * i;
		}
		return fatorial;
		}
	
	//Resolu��o Recursiva
	public static int fatorial1(int n){
		if(n <=1) {
			return 1;
		}
		return  n * fatorial1(n - 1);
		}

}
