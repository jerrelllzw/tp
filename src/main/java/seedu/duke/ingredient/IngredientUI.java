package seedu.duke.ingredient;

import seedu.duke.main.MainUI;

public class IngredientUI {
    public static void printAddIngredientMessage(Ingredient newIngredient) {
        MainUI.printSingleLine();
        System.out.println("Got it. This ingredient was added:");
        System.out.println("Ingredient Name: " + newIngredient.getName());
        System.out.println("Ingredient Quantity: " + newIngredient.getQuantity());
        MainUI.printSingleLine();
    }

    public static void printInvalidCommandSyntaxMessage() {
        MainUI.printSingleLine();
        System.out.println("Invalid command syntax!");
        MainUI.printSingleLine();
    }

    public static void printRemoveIngredientMessage(Ingredient deletedIngredient) {
        MainUI.printSingleLine();
        System.out.println("Got it. This ingredient was deleted:");
        System.out.println(deletedIngredient.getName());
        MainUI.printSingleLine();
    }

    public static void printInvalidIndexMessage() {
        MainUI.printSingleLine();
        System.out.println("That ingredient does not exist!");
        MainUI.printSingleLine();
    }

    public static void printEmptyListMessage() {
        MainUI.printSingleLine();
        System.out.println("No ingredients found.");
        MainUI.printSingleLine();
    }

    public static void printIngredientListMessage(IngredientList ingredients) {
        MainUI.printSingleLine();
        System.out.println("Here are the ingredients in your list:");
        for (int i = 0; i < ingredients.ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredients.ingredientList.get(i));
        }
        MainUI.printSingleLine();
    }
}