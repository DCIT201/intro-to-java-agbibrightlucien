import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Display the menu
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        // Read the user's choice
        int choice = input.nextInt();

        // Check if the choice is valid
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please restart the program and choose 1 or 2.");
        } else {
            // Ask the user for the temperature value
            System.out.print("Enter the temperature: ");
            double temperature = input.nextDouble();

            if (choice == 1) {
                // Convert Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
            } else if (choice == 2) {
                // Convert Fahrenheit to Celsius
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is: " + celsius);
            }
        }

        // Close the scanner
        input.close();
    }
}
