package assignment1;

import java.util.Scanner;

public class task7 {

    static Scanner sc = new Scanner(System.in);

    public static void rev(int n) {
        if (n == 0) return;

        int x = sc.nextInt();
        rev(n - 1);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        rev(n);
    }
}