package practice;
import java.util.Scanner;

public class TipCalculator {

    public static double CalcTip(double s, double t, int p){
        return Math.ceil((s*(1+t/100))/p * 100)/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the subtotal: $");
        double subtotal = sc.nextDouble();
        
        System.out.print("Enter the tip: ");
        double tip = sc.nextDouble();

        System.out.print("Enter the party size: ");
        int party_size = sc.nextInt();

        System.out.println("The total for each person is $" + CalcTip(subtotal, tip, party_size));

        sc.close();
    }
}
