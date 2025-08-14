import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){



        int n = 6;
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;

        }
        System.out.println(b);

    }

}