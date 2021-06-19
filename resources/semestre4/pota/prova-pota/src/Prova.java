public class Prova {
    public static void main(String[] args) {

        int n =1000;
       System.out.println(metodo(n));

    }

    public static int metodo (int n){
        if(n<10){
            return n;
        }
        return 1 + metodo(n-2);
    }
}
