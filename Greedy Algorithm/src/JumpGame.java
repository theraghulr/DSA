public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        System.out.println(canJump(nums));


    }
    public static boolean canJump(int[] nums) {

        int maxlength = 0;

        for(int i =0; i<nums.length; i++){
            if(i>maxlength) return false;

            maxlength = Math.max(maxlength , i+nums[i]);
        }
        return true;

    }
}
