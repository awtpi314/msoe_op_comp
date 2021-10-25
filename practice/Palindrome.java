package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase word: ");
        String input = sc.nextLine();

        boolean palindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (!(input.charAt(i) == input.charAt(input.length() - i - 1))) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}