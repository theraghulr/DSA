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
     int n = 23542;
     int target = 2;
     int result  = Counting(n,target);
        System.out.println(result);

    }

    public static int Counting (int n , int target){
        int count = 0;

        while(n>0){
            int digit = n% 10;

            if(digit == target){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}

