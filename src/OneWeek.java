import java.util.Scanner;

/**
 * OneWeek
 */
public class OneWeek {
    public static void main(String[] args) {
        int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int month;
        System.out.print("Enter the month: ");

        while (true) {
            month = sc.nextInt();
            if (month > 12 || month < 1) {
                System.out.print("I'm sorry, that is not correct. Please repeat 3rd grade: ");
            } else {
                break;
            }
        }

        int day;
        System.out.print("Enter the day of the month: ");

        while (true) {
            day = sc.nextInt();
            if (day > daysInMonth[month - 1] || day < 1) {
                System.out.print("I'm sorry, that is not correct. Please repeat 3rd grade: ");
            } else {
                break;
            }
        }

        if (day + 7 > daysInMonth[month - 1]) {
            int newDaysNotNeeded = daysInMonth[month - 1] - day;
            day = 7 - newDaysNotNeeded;
            month++;
            if (month >= 13) {
                month = 1;
                year++;
            }
        } else {
            day += 7;
        }
        System.out.printf("%d-%d-%d", year, month, day);

        sc.close();
    }
}