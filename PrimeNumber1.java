// WAP to check given number is prime or not using no return type with no argument method?
import java.util.Scanner;

class PrimeNumber1 {
    public static void main(String[] args) {
        // Caller method
        prime();
    }

    // Callee method
    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean flag = true;

        // Start loop from 2, go till n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;	
            }
        }

        if (flag && n>1) // Also checking if n is greater than 1
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}
