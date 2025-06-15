public class Armstrong {
    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("153 is Armstrong: " + isArmstrong(153));
    }
}
