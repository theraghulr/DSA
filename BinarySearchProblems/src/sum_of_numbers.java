import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int odd=0;
        int even=0;

        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                odd=odd+i;
            }
            else if(i%2!=0){
                even=even+i;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
