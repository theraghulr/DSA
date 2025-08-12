public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        int i =0;
        int j = arr.length-1;
        Reverse(arr,i,j);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void Reverse(int[] nums, int i, int j){

        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
