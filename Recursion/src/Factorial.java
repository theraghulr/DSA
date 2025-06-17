public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialN(5));
    }

    private static int FactorialN(int n) {
        if(n<=1){
            return 1;
        }
        return n * FactorialN(n-1);

    }
}
