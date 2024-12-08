import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner converter = new Scanner(System.in);

        System.out.println("A Simple Temperature Converter");
        System.out.println("Please enter your first name:");
        String firstName = converter.nextLine();
        System.out.println("Welcome " + firstName + " to my Temperature Converter!");
        System.out.println("Please choose between the two options below:");
        System.out.println("Option a: Convert from Celsius to Fahrenheit");
        System.out.println("Option b: Convert from Fahrenheit to Celsius");

        String option = converter.nextLine();

        if (option.equalsIgnoreCase("a")) {
            System.out.println("Input the desired temperature you want to convert to Fahrenheit:");
            double celsius = converter.nextDouble();
            if (celsius < -273.15) {
                System.out.println("The temperature cannot be lower than -273.15 Celsius.");
            } else {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("The temperature in Fahrenheit = " + fahrenheit);
            }
        } else if (option.equalsIgnoreCase("b")) {
            System.out.println("Input the desired temperature you want to convert to Celsius:");
            double fahrenheit = converter.nextDouble();
            if (fahrenheit < -459.67) {
                System.out.println("The temperature cannot be lower than -459.67 Fahrenheit.");
            } else {
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("The temperature in Celsius = " + celsius);
            }
        } else {
            System.out.println("Invalid option. Please choose 'a' or 'b'.");
        }

        System.out.println("THANK YOU FOR USING THE TEMPERATURE CONVERTER.");
        converter.close();
    }
}
