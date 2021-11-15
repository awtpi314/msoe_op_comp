import java.util.Scanner;

public class MatchingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int input;

        System.out.print("Enter a series of integers: ");
        
        int firstInt = sc.nextInt();

        do {
            input = sc.nextInt();
            if (input == firstInt)
                counter++;
        } while (input > 0);
        
        System.out.println("The number " + firstInt + " was entered " + counter + " times");

        sc.close();
    }
}
