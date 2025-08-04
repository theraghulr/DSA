public class POW {
    public static void main(String[] args) {
        double x =2;
        int n = 10;
        System.out.println(myPow(x,n));

    }
    public static double myPow(double x, int n) {
        double ans =1.0;
        long longN =n;
        if(longN<0){
            longN=-1*longN;
        }
        while(longN>0){
            if(longN%2==1){
                ans = ans*x;
                longN = longN-1;
            }else{
                x=x*x;
                longN=longN/2;
            }
        }
        if(n<0){
            ans=1.0/ans;
        }
        return ans;

    }
}
