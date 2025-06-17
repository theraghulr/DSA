public class SolidersCircle {
    public static void main(String[] args) {
        int n =41;
        int k = 3;

        System.out.println(elimination(n,k)+1);

    }

    static int elimination (int n, int k){
        if(n==1){
            return 0;
        }

        return (elimination(n - 1, k) + k) % n;
    }
}
