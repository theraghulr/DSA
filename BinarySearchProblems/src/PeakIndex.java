public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5,6,4,2,1};
        System.out.println(MountainArray(nums));


    }
    static int MountainArray(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start +(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}
