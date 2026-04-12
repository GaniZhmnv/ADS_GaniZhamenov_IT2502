package assignment1;

import java.util.Scanner;

public class task2 {

    public static int sum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sum(arr, i + 1);
    }

    public static void number(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        number(arr, i + 1, sc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        number(arr, 0, sc);

        double avg = (double) sum(arr, 0) / n;
        System.out.println(avg);
    }
}