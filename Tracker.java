
import java.util.*;

public class Tracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Food> foods = new ArrayList<>();

        System.out.println("Welcome to the Calorie & Macro Tracker!");

        // Daily macro goals
        final int dailyCalorieGoal = 2000;
        final int dailyProteinGoal = 150;
        final int dailyCarbGoal = 250;
        final int dailyFatGoal = 70;

        while (true) {
            System.out.print("Enter food name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done"))
                break;

            System.out.print("Calories: ");
            int calories = Integer.parseInt(scanner.nextLine());

            System.out.print("Protein (g): ");
            int protein = Integer.parseInt(scanner.nextLine());

            System.out.print("Carbs (g): ");
            int carbs = Integer.parseInt(scanner.nextLine());

            System.out.print("Fat (g): ");
            int fat = Integer.parseInt(scanner.nextLine());

            foods.add(new Food(name, calories, protein, carbs, fat));
        }

        // Totals
        int totalCalories = 0, totalProtein = 0, totalCarbs = 0, totalFat = 0;

        System.out.println("\nFood Log:");
        for (Food food : foods) {
            System.out.printf("%s - %d cal, %dg protein, %dg carbs, %dg fat\n",
                    food.name, food.calories, food.protein, food.carbs, food.fat);
            totalCalories += food.calories;
            totalProtein += food.protein;
            totalCarbs += food.carbs;
            totalFat += food.fat;
        }

        System.out.println("\nDaily Summary:");
        System.out.printf("Calories: %d (%s)\n", totalCalories,
                compareToGoal(totalCalories, dailyCalorieGoal));
        System.out.printf("Protein: %dg (%s)\n", totalProtein,
                compareToGoal(totalProtein, dailyProteinGoal));
        System.out.printf("Carbs: %dg (%s)\n", totalCarbs,
                compareToGoal(totalCarbs, dailyCarbGoal));
        System.out.printf("Fat: %dg (%s)\n", totalFat,
                compareToGoal(totalFat, dailyFatGoal));
    }

    private static String compareToGoal(int value, int goal) {
        if (value == goal)
            return "On target";
        else if (value < goal)
            return "Below target";
        else
            return "Above target";
    }
}
