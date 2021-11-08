package practice;

import java.util.Scanner;

public class DoubleLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        input = input.toLowerCase();

        int total = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                total++;
            }
        }

        System.out.printf("There are %d double letter(s) in %s", total, input);

        sc.close();
    }
}
