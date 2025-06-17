public class Nto1 {
    public static void main(String[] args) {
        Func(1);
    }

    private static void Func(int n) {

        if(n==6){
            return;
        }
        System.out.println(n);
        Func(n+1);
    }
    private static void FuncBoth(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        FuncBoth(n-1);
        System.out.println(n);
    }
}
