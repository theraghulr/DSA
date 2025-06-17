public class Count3OddNums {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,10};

        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 == 1){
                count=count+1;
                if(count==3){
                    return true;
                }
            }
            else{
                count=0;
            }
        }
        return false;

    }
}
