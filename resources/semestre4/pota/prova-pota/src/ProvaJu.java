public class ProvaJu {

    public static void main(String[] args) {

        int n =1024;
        System.out.println(metodo(n));

    }

    public static int metodo (int n){
        if(n %2 != 0){
            return 1;
        }
        return metodo(n/2) -1;
    }

}
