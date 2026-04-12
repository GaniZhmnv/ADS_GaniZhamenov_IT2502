package assignment1;

import java.util.Scanner;

public class task8 {

    public static boolean letter(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return letter(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (letter(s, 0)) {
            System.out.println("Only digits");
        } else {
            System.out.println("There is a letter");
        }
    }
}