package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        File edu = new File("practice\\educational_doc.txt");
        Scanner fsc;

        try {
            fsc = new Scanner(edu);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            return;
        }

        while (fsc.hasNextLine()) {
            System.out.println(fsc.nextLine());
        }

        fsc.close();
    }
}
