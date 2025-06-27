public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {12, 15, 89, 77,89,77, 99};
        int max = largestnum(nums);
        int Seconlarge = SecondLargest(nums);
        int third  = thirdLargest(nums);
        System.out.println(max);
        System.out.println(Seconlarge);
        System.out.println(third);
    }

    static int largestnum(int[] nums) {
        // Start with the smallest possible integer
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }


    static int SecondLargest (int[] nums){
        int largest = largestnum(nums);
        int scndLargest = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            if(largest >nums[i]&& nums[i]>scndLargest){
                scndLargest = nums[i];
            }
        }
        return scndLargest;
    }
    static int thirdLargest (int[] nums){

        int scndLargest = SecondLargest(nums);
        int thirdlargest = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            if (nums[i] < scndLargest && nums[i] > thirdlargest){
                thirdlargest = nums[i];
            }

        }
        return thirdlargest;
    }
}

