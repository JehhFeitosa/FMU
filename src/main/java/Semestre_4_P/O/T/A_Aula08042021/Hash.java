package Semestre_4_P.O.T.A_Aula08042021;

/*
 * Dado um vetor v de n posi��es, implemente um m�todo chamado 
 * contaNumeros para contar a quantidade de vezes que os n�meros 
 * desse vetor aparecem. Seu m�todo deve receber um vetor v como
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

		//document.body.innerHTML += "<p>" + maior + " (" + ocorrenciasMaior + " ocorr�ncias)</p>";
		
		System.out.println();

	}

}
