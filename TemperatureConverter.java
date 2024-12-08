import java.util.Scanner;

public class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A Simple Temperature Converter");
        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Welcome " + firstName + " to my Temperature Converter!");

        while (true) {
            System.out.println("Please choose between the two options below:");
            System.out.println("Option a: Convert from Celsius to Fahrenheit");
            System.out.println("Option b: Convert from Fahrenheit to Celsius");
            System.out.println("Option q: Quit");

            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("a")) {
                convertCelsiusToFahrenheit(scanner);
            } else if (option.equalsIgnoreCase("b")) {
                convertFahrenheitToCelsius(scanner);
            } else if (option.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid option. Please choose 'a', 'b', or 'q'.");
            }
        }

        System.out.println("THANK YOU FOR USING THE TEMPERATURE CONVERTER.");
        scanner.close();
    }

    private static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.println("Input the desired temperature you want to convert to Fahrenheit:");
        double celsius = getValidTemperatureInput(scanner);
        if (celsius < ABSOLUTE_ZERO_CELSIUS) {
            System.out.println("The temperature cannot be lower than -273.15 Celsius.");
        } else {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit = " + fahrenheit);
        }
    }

    private static void convertFahrenheitToCelsius(Scanner scanner) {
        System.out.println("Input the desired temperature you want to convert to Celsius:");
        double fahrenheit = getValidTemperatureInput(scanner);
        if (fahrenheit < ABSOLUTE_ZERO_FAHRENHEIT) {
            System.out.println("The temperature cannot be lower than -459.67 Fahrenheit.");
        } else {
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius = " + celsius);
        }
    }

    private static double getValidTemperatureInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
