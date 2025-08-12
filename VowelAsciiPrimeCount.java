import java.util.Scanner;

public class VowelAsciiPrimeCount {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        StringBuilder modified = new StringBuilder();
        int primeCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                int ascii = (int) ch;
                modified.append(ascii);
                if (isPrime(ascii)) {
                    primeCount++;
                }
            } else {
                modified.append(ch);
            }
        }
        
        System.out.println("Modified sentence: " + modified);
        System.out.println("Prime ASCII values count: " + primeCount);
        
        sc.close();
    }
}

