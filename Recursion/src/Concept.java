public class Concept {
    public static void main(String[] args) {
        func(5);
    }

    private static void func(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        func (n--); // This will give error cause it will print 5 infinte times
    }

    static void func1(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
       func1(--n); // This will print 5 4 3 2 1 ;
    }


}
