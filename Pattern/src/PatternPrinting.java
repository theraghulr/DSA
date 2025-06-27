public class PatternPrinting {
    public static void main(String[] args) {
////        pattern2(5);
////        patteern3(5);
////        Pattern5(5);
//        Pattern6(6);
        pattern7(5);
        pattern8(5);

    }

    static void pattern1 (int n){
        for(int i = 1 ; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2 (int n){
        for(int i = 1 ; i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void patteern3 (int n){
        for(int i = 0 ; i<=n ; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n){
        for (int row =0; row<2*n; row++){
            int total;
            if(row>n){
                total = 2*n-row;
            }else{
                total=row;
            }
            for(int col=0; col<total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){
        for (int row =0; row<2*n; row++){
            int total;
            if(row>n){
                total = 2*n-row;
            }else{
                total=row;
            }
            int noOfSpaces = n - total;

            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }

            for(int col=0; col<total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i =0; i<=n;i++){
            int totalnoofspcae = n-i;
            for(int space =0; space<totalnoofspcae; space++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces first
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            // Print stars (no space between)
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }





}
