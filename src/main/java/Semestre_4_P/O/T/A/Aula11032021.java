package Semestre_4_P.O.T.A;

/*
 * Elabore um algoritmo em pseudocódigo ou linguagem Java para, dado um valor
numérico inteiro como entrada correspondente à posição do número de Fibonacci na sequência,
devolver como saída o número correspondente à posição na sequência.
 */
class Aula11032021 {


    public static void main(String[] args) {
        // Entrada: posição     Saída: número da sequência
        // Entrada: 0           Saída: 0
        // Entrada  1           Saída: 1
        // Entrada: 3           Saída: 2
        // Entrada  8           Saída: 21

        // Fibonacci
        // 0º número: 0
        // 1º número: 1
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        int n = 3;
        int resposta = fibonacciRecursivo(n);
        //int resposta = fibonacciIterativo(n);
        System.out.println("Entrada: " + n + "\tSaída: " + resposta);
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
