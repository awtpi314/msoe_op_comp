package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the file: ");

        String filename = sc.nextLine();

        File numbers = new File(filename);

        sc.close();

        Scanner fsc;

        try {
            fsc = new Scanner(numbers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        List<Double> numberList = new ArrayList<>();

        while (fsc.hasNextDouble()) {
            numberList.add(fsc.nextDouble());
        }

        Collections.sort(numberList);

        if (numberList.size() % 2 == 1) {
            System.out.printf("The median of the list is %.2f", numberList.get(numberList.size() / 2));
        } else {
            System.out.printf("The median of the list is %.2f",
                    (numberList.get(numberList.size() / 2) + numberList.get(numberList.size() / 2 - 1)) / 2);
        }

        fsc.close();
    }
}
