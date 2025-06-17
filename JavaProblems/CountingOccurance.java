// import java.util.Scanner;

// public class CountingOccurance {

//     public static void main(String[] args)

//     Scanner in = new Scanner(System.in);

//     int n = in.nextInt();

//     int count = 0;

//     while(n>0){
//         int rem = n % 10;

//         if(rem==5){
//             count++;
//         }  [12,567,78,8888,65457]
//         n=n/10;
//     }
// System.out.println(count);
    
// }


import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {  // Fixed the method declaration
        Scanner in = new Scanner(System.in);  // Scanner must be inside the method

        int n = in.nextInt();
        int count = 0;

        while (n > 0) {   // Fixed indentation and structure
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count); // Fixed incorrect system -> System
        in.close();  // Closing Scanner to prevent resource leaks
    }
}

