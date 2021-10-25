package practice;

import java.util.Scanner;
import java.lang.Math;

public class LawOfSines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the length of side a: ");
        double sideA = in.nextDouble();
        System.out.print("Enter the length of side c: ");
        double sideC = in.nextDouble();
        System.out.print("Enter the degree measure of angle A: ");
        double angleA = in.nextDouble();

        double angleC = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(angleA)) / sideA) * sideC));

        angleC = angleC*100;
        angleC = Math.round(angleC);
        angleC = angleC/100;
        System.out.println(angleC);

        in.close();
    }

}