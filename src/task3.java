import java.util.Scanner;

public class task3 {

    public static boolean isPrime(int n, int d) {
        if (n < 2) return false;
        if (d == 1) return true;
        if (n % d == 0) return false;
        return isPrime(n, d - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n, n - 1)) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }
}