import java.util.Scanner;//scammer*

public class OneVowel {

    public static void main(String[] args) {
        String[] vowels = { "a", "e", "i", "o", "u" };
        int[] vowelOccurrences = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a word: ");
        String input = sc.nextLine();
        String[] split = input.split("");

        for (String current : split) {
            for (int i = 0; i < 5; i++) {
                if (current.compareTo(vowels[i]) == 0 && vowelOccurrences[i] == 0) {
                    vowelOccurrences[i]++;
                }
            }
        }

        if (vowelOccurrences[0] + vowelOccurrences[1] + vowelOccurrences[2] + vowelOccurrences[3]
                + vowelOccurrences[4] == 1) {
            System.out.println("The word contains 1 unique vowel.");
        } else {
            System.out.println("The word does not contain 1 unique vowel.");
        }

        sc.close();
    }
}