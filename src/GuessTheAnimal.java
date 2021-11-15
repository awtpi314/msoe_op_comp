import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuessTheAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Question> questionMap = new HashMap<>();

        System.out.print("Enter the file name: ");
        String filename = sc.nextLine();

        File questionsFile = new File(filename);

        Scanner fileScan;

        try {
            fileScan = new Scanner(questionsFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (true) {
            int position = Integer.parseInt(fileScan.nextLine());

            String[] questionInfo = new String[3];
            for (int i = 0; i < 3; i++) {
                questionInfo[i] = fileScan.nextLine();
            }

            questionMap.put(position, new Question(questionInfo[0], questionInfo[1], questionInfo[2]));

            if (fileScan.hasNextLine()) {
                fileScan.nextLine();
            } else {
                break;
            }
        }

        boolean hasAnswer = false;
        int currentQuery = 1;
        String bestGuess = "";

        while (!hasAnswer) {
            Question currentQuestion = questionMap.get(currentQuery);
            System.out.println(currentQuestion.question);
            System.out.print("Please enter the answer as [yes | y | N] or [no | n | N] (defaults to yes): ");
            String answer = sc.nextLine();
            if (answer.compareTo("no") == 0 || answer.compareTo("n") == 0 || answer.compareTo("N") == 0) {
                try {
                    currentQuery = Integer.parseInt(currentQuestion.ifFalse);
                } catch (NumberFormatException e) {
                    hasAnswer = true;
                    bestGuess = currentQuestion.ifFalse;
                }
            } else {
                try {
                    currentQuery = Integer.parseInt(currentQuestion.ifTrue);
                } catch (NumberFormatException e) {
                    hasAnswer = true;
                    bestGuess = currentQuestion.ifTrue;
                }
            }
        }

        System.out.println("My best guess is that your animal is a " + bestGuess);
    }
}

class Question {
    String question;
    String ifTrue;
    String ifFalse;

    public Question(String q, String ifT, String ifF) {
        question = q;
        ifTrue = ifT;
        ifFalse = ifF;
    }
}