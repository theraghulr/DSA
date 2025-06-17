public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums ={2,4,5,6,7,8,9,10,12,25,28,30,33,37,39,41,55};
        int target = 33;
        System.out.println(ans(nums,target));


    }
    static int ans(int[] nums, int target){
        //First find the range
        //Then start unti box of size 2
        int start =0;
        int end = 2;
        //While conditionn for target to lie in range
        while(target>nums[end]){
            int newstart= end+1;
            end= end+(end-start+1)*2;
            start = newstart;

        }
        return BinarySearch (nums,target,start, end);

    }

    static  int BinarySearch(int[] nums, int target, int start, int end){

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target <nums[mid]){
                start = mid +1;

            }else if (target > nums[mid]){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1; // not found
    }
}
