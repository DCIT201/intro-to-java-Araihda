// Imports the Scanner class for user input//
import java.util.Scanner;

public class TemperatureConverter{
    
        public static void main(String[] args) {
            //Displays the title of the program and the options available to the user//
            System.out.println("TEMPERATURE CONVERTER");
            System.out.println("To perform your calculations, select your preferred converter option:");
            System.out.println("1.Convert Celsius to Fahrenheit");
            System.out.println("2.Convert Fahrenheit to Celsius");

        // Creates a Scanner object to read user input//
        Scanner scanner = new Scanner(System.in);
        // Reads the user's input//
        int option = scanner.nextInt();
        // Checks if the user selected option 1 (Celsius to Fahrenheit)//

        if (option==1){
            // Prompts the user to enter the temperature in Celsius//
            System.out.println("Enter temperature in Celsius:");
            double Celsius = scanner.nextDouble();
            // Checks if the temperature entered is from the range of 0 t0 100//
            if(Celsius>=0 && Celsius<=100){
                // Calculates the temperature in Fahrenheit//
                double Fahrenheit = (Celsius * 9/5) + 32;
                // Displays the temperature in Fahrenheit//
                System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
            }
            // Displays an error message if the temperature entered is not from the range of 0 to 100//
            else{
            System.out.println("Invalid Celsius temperature entered. Run code again and enter temperature in Celsius:");
           }
        }

        // Checks if the user selected option 2 (Fahrenheit to Celsius)// 
        else if (option==2){
            // Prompts the user to enter the temperature in Fahrenheit//
            System.out.println("Enter temperature in Fahrenheit");
            double Fahrenheit = scanner.nextDouble();
            // Checks if the temperature entered is from the range of 32 to 212//
            if(Fahrenheit>=32 && Fahrenheit <=212){
            // Calculates the temperature in Celsius//
            double Celsius = (Fahrenheit - 32) * 5/9;
            // Displays the temperature in Celsius//
            System.out.println("Temperature in Celsius: " + Celsius);

        }
            else {
            // Displays an error message if the temperature entered is not from the range of 32 to 212//
            System.out.println("Invalid Fahrenheit temperature entered.Run code again and enter temperature in Fahrenheit again:");
        }
    }
    
    else {
        // Displays an error message if the user enters an invalid option//
        System.out.println("Invalid option entered; enter option again:");
    }
  }
}