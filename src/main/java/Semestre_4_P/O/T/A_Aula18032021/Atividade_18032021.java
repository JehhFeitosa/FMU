package Semestre_4_P.O.T.A_Aula18032021;

public class Atividade_18032021 {

	public static void main(String[] args) {
		//metodo(1024);
		
		System.out.println(metodo1(5));

	}
	
	public static int metodo1(int n) {
		int c= 0;
		for (int i =0; i <= n; i++) {
			c = c + 1;
			System.out.println("v" + i);
		}
		return c;
	}
	
	public static int metodo(int n) {
		if(n%2 != 0) {
			return 1;
		}else {
			return metodo (n/2) - 1;
		}
	}
	
	

}
