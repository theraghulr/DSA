public class Sum_Of_Subarray_Ranges {
    public static void main(String[] args) {
        int [] arr ={1,3,3};
        System.out.println(subArrayRanges(arr));

    }
    public  static long subArrayRanges(int[] nums) {
        int n = nums.length;
        long result = 0;

        for (int i = 0; i < n; i++) {
            int minVal = nums[i];
            int maxVal = nums[i];
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                result += (maxVal - minVal);
            }
        }

        return result;
    }
}
