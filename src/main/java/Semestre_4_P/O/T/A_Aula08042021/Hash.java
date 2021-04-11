package Semestre_4_P.O.T.A_Aula08042021;

/*
 * Dado um vetor v de n posições, implemente um método chamado 
 * contaNumeros para contar a quantidade de vezes que os números 
 * desse vetor aparecem. Seu método deve receber um vetor v como
 * entrada e devolver um vetor w cp, essa contagem
 */
public class Hash {

	public static void main(String[] args) {
		int[] entrada = {1, 2, 3, 4, 5, 2, 2, 3};

		int maior = 0;
		int ocorrenciasMaior = -1;

		for ( int i = 0 ; i < entrada.length ; i++ ) {
		  int ocorrencias = 1;
		  for ( int t = i+1 ; t < entrada.length ; t++ )
		    if ( entrada[i] == entrada[t] )
		      ocorrencias++;
		  
		  if ( ocorrencias > ocorrenciasMaior ) {
		    maior = entrada[i];
		    ocorrenciasMaior = ocorrencias;
		  }
		}

		//document.body.innerHTML += "<p>" + maior + " (" + ocorrenciasMaior + " ocorrências)</p>";
		
		System.out.println();

	}

}
