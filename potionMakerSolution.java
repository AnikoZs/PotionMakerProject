import java.util.Scanner;

public class potionMakerSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select potion base
        String base = selectPotionBase(scanner);
        int baseCost = getBaseCost(base);

        // Select ingredients and effects
        int ingredients = getMagicalIngredients(scanner);
        int effects = getMagicalEffects(scanner);

        // Calculate costs
        int ingredientCost = calculateIngredientCost(ingredients);
        double effectCost = calculateEffectCost(effects);
        double totalCost = calculateTotalCost(baseCost, ingredientCost, effectCost);

        // Print receipt
        printReceipt(base, baseCost, ingredients, ingredientCost, effects, effectCost, totalCost);

        scanner.close();
    }

    public static String selectPotionBase(Scanner scanner) {
        System.out.println("Choose a potion base:");
        System.out.println("1. Unicorn Tears (5 Galleons)");
        System.out.println("2. Dragon Blood (4 Galleons)");
        System.out.println("3. Phoenix Feather Extract (3 Galleons)");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return "Unicorn Tears";
        } else if (choice == 2) {
            return "Dragon Blood";
        } else if (choice == 3) {
            return "Phoenix Feather Extract";
        } else {
            return "Unknown Potion Base";
        }
    }

    public static int getBaseCost(String base) {
        if (base.equals("Unicorn Tears")) {
            return 5;
        } else if (base.equals("Dragon Blood")) {
            return 4;
        } else if (base.equals("Phoenix Feather Extract")) {
            return 3;
        } else {
            return 0;
        }
    }

    public static int getMagicalIngredients(Scanner scanner) {
        System.out.print("Enter the number of magical ingredients (45 Galleon each): ");
        return scanner.nextInt();
    }

    /**
     * Prompts the user to enter the number of magical effects and returns the value.
     * Each magical effect costs 0.5 Galleons.
     *
     * @param scanner Scanner object to take user input.
     * @return The number of magical effects chosen by the user.
     */
    public static int getMagicalEffects(Scanner scanner) {
        System.out.print("Enter the number of magical effects (5 Galleons each): ");
        return scanner.nextInt();
    }

    public static int calculateIngredientCost(int ingredients) {
        return ingredients * 45;
    }

    public static double calculateEffectCost(int effects) {
        return effects * 5;
    }

    public static double calculateTotalCost(int baseCost, int ingredientCost, double effectCost) {
        return baseCost + ingredientCost + effectCost;
    }

    public static void printReceipt(String base, int baseCost, int ingredients, int ingredientCost, int effects, double effectCost, double totalCost) {
        System.out.println("\n--- Magical Potion Receipt ---");
        System.out.println("Potion Base: " + base + " - " + baseCost + " Galleons");
        System.out.println("Magical Ingredients: " + ingredients + " - " + ingredientCost + " Galleons");
        System.out.println("Magical Effects: " + effects + " - " + effectCost + " Galleons");
        System.out.println("Total Cost: " + totalCost + " Galleons");
        System.out.println("Thank you for brewing with us at Hogwarts!");
    }
}


