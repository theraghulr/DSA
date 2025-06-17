public class DigitsOfProduct {
    public static void main(String[] args) {
        int n = 1432;
        System.out.println(Product(n));

    }
    static int Product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * Product(n/10);
    }
}
