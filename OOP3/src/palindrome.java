public class palindrome {
    public static void main(String[] args) {
        String input = "Raghul";
        char[] chars = input.toCharArray();
        isPalindrome(chars);
        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
    }

    static void isPalindrome(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}

