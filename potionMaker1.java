import java.util.Scanner;

public class potionMaker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select potion base
        String base = selectPotionBase(scanner);
        int baseCost = getBaseCost(base);

        // Select ingredients and effects
        int ingredients = getMagicalIngredients(scanner);
        int effects = getMagicalEffects(scanner);

        // Calculate costs


        // Print receipt


        scanner.close();
    }

    public static String selectPotionBase(Scanner scanner) {
        return "something";
    }

    public static int getBaseCost(String base) {
        return 0;
    }

    public static int getMagicalIngredients(Scanner scanner) {
        return 0;
    }

    public static int getMagicalEffects(Scanner scanner) {
        return 0;
    }


}




