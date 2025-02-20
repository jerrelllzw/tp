package seedu.duke.ingredient;

import seedu.duke.main.MainUI;

import java.time.LocalDate;

public class IngredientUI {
    public static void printAddIngredientMessage(Ingredient newIngredient) {
        MainUI.printSingleLine();
        System.out.println(" Got it. This ingredient was added:");
        System.out.println("   Ingredient Name: " + newIngredient.getName());
        System.out.println("   Ingredient Quantity: " + newIngredient.getQuantity());
        System.out.println("   Ingredient Unit Price: " + newIngredient.getPrice());
        System.out.println("   Expiry Date: " + newIngredient.getExpiry());
        System.out.println("\n   " + newIngredient);
        MainUI.printSingleLine();
    }

    public static void printInvalidCommandSyntaxMessage(String command) {
        MainUI.printSingleLine();
        System.out.println(" Invalid command syntax!");
        printSampleCommandSyntaxMessage(command);
        System.out.println(" Please refer to our user guide for more details: " +
                "https://ay2122s1-cs2113t-t12-4.github.io/tp/UserGuide.html");
        MainUI.printSingleLine();
    }

    public static void printRemoveIngredientMessage(Ingredient deletedIngredient) {
        MainUI.printSingleLine();
        System.out.println(" Got it. This ingredient was deleted:");
        System.out.println("   " + deletedIngredient);
        MainUI.printSingleLine();
    }

    public static void printInvalidIndexMessage() {
        MainUI.printSingleLine();
        System.out.println(" That ingredient does not exist!");
        MainUI.printSingleLine();
    }

    public static void printEmptyListMessage() {
        MainUI.printSingleLine();
        System.out.println(" No ingredients found.");
        MainUI.printSingleLine();
    }

    public static void printIngredientListMessage(IngredientList ingredients) {
        MainUI.printSingleLine();
        System.out.println(" Here are the ingredients in your list:");
        for (int i = 0; i < ingredients.ingredientList.size(); i++) {
            System.out.println("   " + (i + 1) + ". " + ingredients.ingredientList.get(i));
        }
        MainUI.printSingleLine();
    }

    public static void printExpiredIngredientMessage(LocalDate inputDate, IngredientList ingredients) {
        boolean hasExpiredIngredients = false;
        MainUI.printSingleLine();
        System.out.println(" These ingredients are expired:");

        for (int i = 0; i < ingredients.ingredientList.size(); i++) {
            if (ingredients.ingredientList.get(i).getExpiry().isBefore(inputDate)) {
                System.out.println("   " + ingredients.ingredientList.get(i));
                hasExpiredIngredients = true;
            }
        }
        if (!hasExpiredIngredients) {
            System.out.println("   " + "None :)");
        }
        MainUI.printSingleLine();
    }

    public static void printSampleCommandSyntaxMessage(String command) {
        switch (command) {
        case "add":
            System.out.println(" Please follow this syntax:");
            System.out.println("   add-ingredient/INGREDIENT_NAME/QUANTITY/PRICE/EXPIRY_DATE");
            System.out.println("   <INGREDIENT_NAME> must be a string.");
            System.out.println("   <QUANTITY> must be a positive, non-zero integer.");
            System.out.println("   <PRICE> must be a positive number greater than 0.01.");
            System.out.println("   <EXPIRY_DATE> must be a valid date in YYYY-MM-DD format.");
            break;
        case "remove":
            System.out.println(" Please follow this syntax:");
            System.out.println("   remove-ingredient/INGREDIENT_INDEX");
            System.out.println("   <INGREDIENT_INDEX> must be a positive integer corresponding to the list index.");
            break;
        case "find":
            System.out.println(" Please follow this syntax:");
            System.out.println("   find-expired-ingredient/INPUT_DATE");
            System.out.println("   <INPUT_DATE> must be a valid date in YYYY-MM-DD format.");
            break;
        default:
            break;
        }
    }
}