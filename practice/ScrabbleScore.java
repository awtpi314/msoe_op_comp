package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScrabbleScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.toLowerCase();

        List<List<Character>> letterScores = new ArrayList<>();

        letterScores.add(Arrays.asList(new Character[] { 'a', 'e', 'i', 'l', 'n', 'o', 'r', 's', 't', 'u' }));
        letterScores.add(Arrays.asList(new Character[] { 'd', 'g' }));
        letterScores.add(Arrays.asList(new Character[] { 'b', 'c', 'm', 'p' }));
        letterScores.add(Arrays.asList(new Character[] { 'f', 'h', 'v', 'w', 'y' }));
        letterScores.add(Arrays.asList(new Character[] { 'k' }));
        letterScores.add(Arrays.asList(new Character[] { 'j', 'x' }));
        letterScores.add(Arrays.asList(new Character[] { 'q', 'z' }));

        int total = 0;
        boolean found = false;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < letterScores.size(); j++) {
                for (Character currentCharacter : letterScores.get(j)) {
                    if (currentCharacter == input.charAt(i)) {
                        if (j == 5) {
                            total += 8;
                        } else if (j == 6) {
                            total += 10;
                        } else {
                            total += j + 1;
                        }
                        found = true;
                        break;
                    }
                }
                if (found) {
                    found = false;
                    break;
                }
            }
        }

        System.out.println(total);

        sc.close();
    }
}
