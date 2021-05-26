package appordenacao;

import java.util.Random;

public class AppOrdenacao {

    public static void main(String[] args) {
        int n = 100000000;
        int[] v = new int[n];
        int[] w = new int[n];

        // Gera um vetor aleatoriamente
        for (int i = 0; i < n; i++) {
            v[i] = geraNumero();
            w[i] = v[i];
        }

        // Bubble sort 1
        //long ini = System.currentTimeMillis();
        //bubbleSort(v, v.length);
        //long fim = System.currentTimeMillis();
        
        // Bubble sort 2
        //long ini2 = System.currentTimeMillis();
        //bubbleSort2(v, v.length);
        //long fim2 = System.currentTimeMillis();
        
        // Merge sort
        long ini3 = System.currentTimeMillis();
        mergeSort(v, v.length);
        long fim3 = System.currentTimeMillis();

        // Quick sort
        long ini4 = System.currentTimeMillis();
        mergeSort(w, w.length);
        long fim4 = System.currentTimeMillis();

        /*
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            System.out.print(" ");
        }
        */
        System.out.println();
        
        //System.out.println("Tempo (BubbleSort1): " + (fim - ini) + "ms");
        //System.out.println("Tempo (BubbleSort2): " + (fim2 - ini2) + "ms");
        //System.out.println("Tempo (MergeSort): " + (fim3 - ini3) + "ms");
        //System.out.println("Tempo (QuickSort): " + (fim4 - ini4) + "ms");
    }

    public static void bubbleSort(int[] v, int n) {
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (v[j] < v[i]) {
                    // Troca
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
    }

    public static void bubbleSort2(int[] v, int n) {
        int aux;
        boolean trocou = true;
        for (int i = n - 1; i > 0 && trocou; i--) {
            trocou = false;
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j + 1]) {
                    troca(v, j, j + 1);
                    // Ou use o método acima
                    // Ou use o código comentado abaixo
                    //aux = v[j];
                    //v[j] = v[j + 1];
                    //v[j + 1] = aux;
                    trocou = true;
                }
            }
        }
    }

    public static void troca(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void mostra(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int geraNumero() {
        Random rnd = new Random();
        return rnd.nextInt(100);
    }

    /* Método de Ordenação: Merge Sort */
    public static void mergeSort(int[] v, int n) {
        int[] aux = new int[n];
        mergeSort(v, aux, 0, n - 1);
    }

    private static void mergeSort(int[] v, int[] aux, int e, int d) {
        if (d <= e) {
            return;
        }
        int m = (d + e) >> 1;
        mergeSort(v, aux, e, m);
        mergeSort(v, aux, m + 1, d);
        merge(v, aux, e, m, d);
    }

    private static void merge(int[] v, int[] aux, int e, int m, int d) {
        int i, j, k;
        i = k = e;
        j = m + 1;

        while ((i <= m) && (j <= d)) {
            if (v[i] < v[j]) {
                aux[k++] = v[i++];
            } else {
                aux[k++] = v[j++];
            }
        }
        while (i <= m) {
            aux[k++] = v[i++];
        }
        while (j <= d) {
            aux[k++] = v[j++];
        }
        while (e <= d) {
            v[e] = aux[e++];
        }
    }

    /* Método de Ordenação: Quick Sort */
    public static void quickSort(int[] v, int n) {
        quickSort(v, 0, n - 1);
    }

    private static void quickSort(int[] v, int e, int d) {
        if (d <= e) {
            return;
        }

        int i, j;
        i = ((int) Math.random()) % (d - e) + e + 1;
        int pivo = v[i];
        v[i] = v[e];
        v[e] = pivo;

        i = e;
        j = d;
        while (true) {
            while ((j > i) && (v[j] > pivo)) {
                j--;
            }
            if (i == j) {
                break;
            }
            v[i] = v[j];
            i++;
            while ((i < j) && (v[i] < pivo)) {
                i++;
            }
            if (i == j) {
                break;
            }
            v[j] = v[i];
            j--;
        }
        v[i] = pivo;

        quickSort(v, e, i - 1);
        quickSort(v, i + 1, d);
    }
}
