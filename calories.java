 //* Brandon Gerber
//*  Calories
 //* 10/13/2023
 //* This program was made to find someone's caloric needs depending on their weight
 //* if they input under 10lbs the system will close out 
 //* The user is also prompted to check whether they are active or not

package calories;

import java.util.Scanner;

public class calories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // display a welcome message
        System.out.println("Welcome to the Daily Caloric Needs Calculator!");

        // prompt user for their weight
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        // if weight is less than 10 pounds exit 
        if (weight < 10) {
            System.out.println("Weight should be at least 10 pounds. Exiting...");
            System.exit(1);
        }

        // prompt to select their gender
        System.out.println("Select your gender:");
        System.out.println("1) Male");
        System.out.println("2) Female");
        int gender = input.nextInt();

        // prompt for activity level
        System.out.println("Select your activity level:");
        System.out.println("1) Moderately Active");
        System.out.println("2) Low Activity Level");
        int activityLevel = input.nextInt();

        // used calculatecalories to display calories needed
        double caloriesNeeded = calculateCalories(weight, gender, activityLevel);

        // display daily need 
        System.out.println("Your daily caloric need is: " + caloriesNeeded + " calories");

       input.close();
    }

    // function to calculate daily caloric needs based on weight, gender, and activity level
    public static double calculateCalories(double weight, int gender, int activityLevel) {
        double calories = 0;

        if (gender == 1) {
            if (activityLevel == 1) {
                calories = weight * 15;
            } else if (activityLevel == 2) {
                calories = weight * 13;
            }
        } else if (gender == 2) {
            if (activityLevel == 1) {
                calories = weight * 12;
            } else if (activityLevel == 2) {
                calories = weight * 10;
            }
        }

        return calories;
    }
}