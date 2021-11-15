import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumThievery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> houses = new ArrayList<>();

        System.out.print("Enter the worth of the houses: ");
        String[] input = sc.nextLine().split(" ");


        for (String s : input) {
            houses.add(Integer.parseInt(s));
        }

        sc.close();

        houses.add(0);
        houses.add(0);
        houses.add(0);

        List<Integer> maxValues = new ArrayList<>();
        List<Integer> housesFrom = new ArrayList<>();

        for (int i = 0; i < houses.size() - 3; i++) {
            if (houses.get(i) + houses.get(i + 2) > houses.get(i) + houses.get(i + 3)) {
                maxValues.add(houses.get(i) + houses.get(i + 2));
                housesFrom.add(2);
            } else {
                maxValues.add(houses.get(i) + houses.get(i + 3));
                housesFrom.add(3);
            }
        }

        System.out.println(maxValues);

        maxValues.add(0);
        maxValues.add(0);

        int totalHaul = 0;

        int i;
        for (i = 0; i < maxValues.size() - 2; i++) {
            if (maxValues.get(i) > maxValues.get(i + 1) && maxValues.get(i) >= maxValues.get(i + 2) - houses.get(i + 2)) {
                totalHaul += maxValues.get(i);
                i += housesFrom.get(i);
            }
        }
        if (i == maxValues.size() - 1)
            totalHaul += maxValues.get(i);

        System.out.println(totalHaul);
    }
}
