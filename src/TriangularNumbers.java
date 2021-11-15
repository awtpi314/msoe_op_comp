import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TriangularNumbers {
    static List<Integer> numbers = new ArrayList<>();
    static int[] answer = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int input = sc.nextInt();
        int lastTriNum = 0;
        int count = 0;

        numbers.add(0);

        do {
            numbers.add(lastTriNum+(++count));
            lastTriNum = numbers.get(count);
        } while (lastTriNum < input);


        if(calc(input)){
            System.out.println(Arrays.toString(answer));
        } else {
            System.out.println("ERROR");
        }

        sc.close();
    }
    
    public static boolean calc(int num) {
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.size(); j++){
                for (Integer number : numbers) {
                    if (numbers.get(i) + numbers.get(j) + number == num) {
                        answer[0] = numbers.get(i);
                        answer[1] = numbers.get(j);
                        answer[2] = number;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
