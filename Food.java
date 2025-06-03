public class Food {
    String name;
    int quantity; // in grams
    int calories;
    int protein;
    int carbs;
    int fat;

    public Food(String name, int quantity, int calories, int protein, int carbs, int fat) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public void printDetails() {
        System.out.println(name + " (" + quantity + "g): " + calories + " kcal, " +
                protein + "g protein, " + carbs + "g carbs, " + fat + "g fat");
    }
}
