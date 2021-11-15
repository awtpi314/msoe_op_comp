import java.util.Scanner;

public class ExposureTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the brightness of the scene: ");
        double V = sc.nextDouble();
        double N;

        do {
            System.out.print("Please enter the aperture: ");
            N = sc.nextDouble();
        } while (N <= 0);

        System.out.print(Math.pow(N, 2)/Math.pow(2, V));

        sc.close();
    }
}
