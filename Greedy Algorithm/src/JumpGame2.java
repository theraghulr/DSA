public class JumpGame2 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(jump(nums));

    }
    public static int jump(int[] nums) {

        int jumps =0;
        int l = 0;
        int r= 0;

        for(int i =0; i<nums.length-1; i++){
            r = Math.max(r, i+ nums[i]);

            if(i == l){
                jumps++;
                l = r;
            }
        }
        return jumps;
    }
}
