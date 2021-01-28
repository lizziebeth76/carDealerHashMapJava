package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Liz's Land o' Wheels!");
        lizWheel();
    }

    public static void lizWheel() {
        Scanner scanner = new Scanner(System.in);
        // instantiate a HashMap instance
        HashMap<String, String> lizInventory = new HashMap<String, String>();

// to use any method, add the function name to the instance name
// General Form: HashMapInstanceName.{functionName}({parameter list});


        lizInventory.put("Honda", "HR-V");
        lizInventory.put("Toyota", "Camry");
        lizInventory.put("Volkswagen", "Beetle");
        lizInventory.put("Shelby", "Cobra");
        lizInventory.put("Chevy", "Nova");
        lizInventory.put("Subaru", "Brat");

            System.out.println("We've got fancy cars, and not so fancy cars.");
            System.out.println("I have six lovely sets of wheels for you to choose from!");
            String nextString = "y";
        while (nextString.equalsIgnoreCase("yes") || nextString.equalsIgnoreCase("y")) {
            System.out.println("Type the name of the make of car you would prefer, choosing from");
            System.out.println("Chevy, Honda, Shelby, Subaru, Toyota, Volkswagen, or something else: ");
            String stuff = scanner.next();
            String things = lizInventory.get(stuff);
            scanner.nextLine();
            if (lizInventory.containsKey(stuff)) {
                System.out.println("These are the models of " + stuff + " that we currently have in stock: " + things);
                nextString = "y";
            } else {
                System.out.println("Looks like you'll be walking to work for a while longer! I don't have those in stock.");
                System.out.println("Would you like to search for a different model of car? Enter yes, or no: ");
                nextString = scanner.nextLine();
                if (nextString.equalsIgnoreCase("yes") || nextString.equalsIgnoreCase("y")) {
                    System.out.print("");
                }else{
                    System.out.println("Thanks for looking. Hope you'll come see us again soon!");
                }
            }
        }
    }
}





