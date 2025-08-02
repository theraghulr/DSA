public class Armstrong {
    public static void main(String[] args) {
        int num = 159;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit, digits);
            num = num / 10;

        }
        return sum == original;
    }
}

