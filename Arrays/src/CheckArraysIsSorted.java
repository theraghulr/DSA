public class CheckArraysIsSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6};

        boolean check = Sorted(arr);
        System.out.println(check);
    }

    static Boolean Sorted(int[] arr){
        for(int i =1; i<arr.length; i++){
            if(arr[i]>= arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
