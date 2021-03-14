package Semestre_4_P.O.T.A;

/*
 * Elabore um algoritmo em pseudoc�digo ou linguagem Java para, dado um valor
num�rico inteiro como entrada correspondente � posi��o do n�mero de Fibonacci na sequ�ncia,
devolver como sa�da o n�mero correspondente � posi��o na sequ�ncia.
 */
class Aula11032021 {


    public static void main(String[] args) {
        // Entrada: posi��o     Sa�da: n�mero da sequ�ncia
        // Entrada: 0           Sa�da: 0
        // Entrada  1           Sa�da: 1
        // Entrada: 3           Sa�da: 2
        // Entrada  8           Sa�da: 21

        // Fibonacci
        // 0� n�mero: 0
        // 1� n�mero: 1
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        int n = 3;
        int resposta = fibonacciRecursivo(n);
        //int resposta = fibonacciIterativo(n);
        System.out.println("Entrada: " + n + "\tSa�da: " + resposta);
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    
    public static int fibonacciIterativo(int n){
        int i = 1;
        int j = 0;
        for (int k = 0; k < n; k++){
            int t = i + j;
            i = j;
            j = t;
        }
        return j;
    }

}
