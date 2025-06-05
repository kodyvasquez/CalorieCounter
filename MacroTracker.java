import java.util.Scanner;

public class MacroTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DailyLog dailyLog = new DailyLog();

        System.out.println("Welcome to the Calorie & Macro Tracker (v1)");

        while (true) {
            System.out.print("\nEnter food name (or type 'done'): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done"))
                break;

            System.out.print("Quantity (grams): ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.print("Calories: ");
            int calories = Integer.parseInt(scanner.nextLine());

            System.out.print("Protein (g): ");
            int protein = Integer.parseInt(scanner.nextLine());

            System.out.print("Carbs (g): ");
            int carbs = Integer.parseInt(scanner.nextLine());

            System.out.print("Fat (g): ");
            int fat = Integer.parseInt(scanner.nextLine());

            Food food = new Food(name, quantity, calories, protein, carbs, fat);
            dailyLog.addFood(food);
        }

        dailyLog.printDailySummary();
        scanner.close();
    }
}