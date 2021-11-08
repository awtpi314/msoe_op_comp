package practice;

import java.util.Scanner;

public class ParallelResistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first resistance: ");
        double resistanceA = sc.nextDouble();
        System.out.print("Enter the second resistance: ");
        double resistanceC = sc.nextDouble();
        System.out.print("Enter the third resistance: ");
        double resistanceB = sc.nextDouble();

        System.out.printf("Total resistance: %.2f", Math.round(1/(1/resistanceA+1/resistanceB+1/resistanceC)*100)/100.0);

        sc.close();
    }
}
