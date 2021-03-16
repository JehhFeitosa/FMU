package Semestre_4_P.O.T.A;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}

	public static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * fatorial(n - 1);
	}
}















//	//Resolução Iterativa
//	public static int fatorial(int n){
//		int fatorial = 1;
//		for (int i = 1; i <= n; i++){
//		fatorial = fatorial * i;
//		}
//		return fatorial;
//		}
//	
//	//Resolução Recursiva
//	public static int fatorial1(int n){
//		if(n <=1) {
//			return 1;
//		}
//		return  n * fatorial1(n - 1);
//		}
