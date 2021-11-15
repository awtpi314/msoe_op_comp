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

        letterScores.add(Arrays.asList('a', 'e', 'i', 'l', 'n', 'o', 'r', 's', 't', 'u'));
        letterScores.add(Arrays.asList('d', 'g'));
        letterScores.add(Arrays.asList('b', 'c', 'm', 'p'));
        letterScores.add(Arrays.asList('f', 'h', 'v', 'w', 'y'));
        letterScores.add(List.of('k'));
        letterScores.add(Arrays.asList('j', 'x'));
        letterScores.add(Arrays.asList('q', 'z'));

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
