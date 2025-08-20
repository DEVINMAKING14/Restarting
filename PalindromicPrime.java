import java.util.Scanner;

public class PalindromicPrime {
    
    // check if number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // check if number is palindrome
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        System.out.println("Palindromic Prime Numbers between " + low + " and " + high + " are:");
        boolean found = false;

        for (int i = low; i <= high; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found.");
        }
    }
}
