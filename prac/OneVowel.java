package prac;
import java.util.Scanner;//scammer*

public class OneVowel {

    public static void main(String[] args) {
        String vowels[] = { "a", "e", "i", "o", "u" };
        int vowelOccurances[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a word: ");
        String input = sc.nextLine();
        String[] split = input.split("");

        for (String current : split) {
            for (int i = 0; i < 5; i++) {
                if (current.compareTo(vowels[i]) == 0 && vowelOccurances[i] == 0) {
                    vowelOccurances[i]++;
                }
            }
        }

        if (vowelOccurances[0] + vowelOccurances[1] + vowelOccurances[2] + vowelOccurances[3]
                + vowelOccurances[4] == 1) {
            System.out.println("The word contains 1 unique vowel.");
        } else {
            System.out.println("The word does not contain 1 unique vowel.");
        }

        sc.close();
    }
}