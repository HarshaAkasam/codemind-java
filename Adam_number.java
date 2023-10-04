import java.util.Scanner;

public class AdamNumber {
    // Function to reverse a number
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    // Function to check if a number is an Adam number
    static boolean isAdam(int num) {
        int numSquared = num * num;
        int revNum = reverse(num);
        int revSquared = revNum * revNum;
        int revRevSquared = reverse(revSquared);
        
        return numSquared == revRevSquared;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if (isAdam(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        scanner.close();
    }
}
