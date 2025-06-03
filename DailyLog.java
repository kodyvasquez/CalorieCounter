import java.util.ArrayList;

public class DailyLog {
    ArrayList<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void printDailySummary() {
        int totalCalories = 0, totalProtein = 0, totalCarbs = 0, totalFat = 0;
        System.out.println("\n--- Daily Summary ---");
        for (Food food : foods) {
            food.printDetails();
            totalCalories += food.calories;
            totalProtein += food.protein;
            totalCarbs += food.carbs;
            totalFat += food.fat;
        }
        System.out.println("\nTotal: " + totalCalories + " kcal | " +
                totalProtein + "g protein | " + totalCarbs + "g carbs | " + totalFat + "g fat");
    }
}