public class MergeWithoutExtraSpace {
    public static void main(String[] args) {

    }
    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        int len = (n+m);
        int gap = (len/2)+(len%2);
        while(gap>0){
            int left = 0;
            int right = left + gap;

            while(right<len){
                if(left<n && right >=n){
                    SwapIfGreater(nums1,nums2,left ,right-n);
                }
                // nums1 and nums2
                else if (left>=n){
                    SwapIfGreater(nums2, nums2, left-n, right-n);
                }
                else{
                    SwapIfGreater(nums1,nums1,left,right);
                }
                left++ ;
                right++ ;
            }
            if(gap==1){
                gap = (gap / 2) + (gap % 2);

                break;


            }
        }

    }

    public static void SwapIfGreater (int[] nums1, int[] nums2, int i, int j){
        if(nums1[i]>nums2[j]){
            int temp = nums1[i];
            nums1[i] = nums2[j];
            nums2[j] = temp;
        }

    }
}
