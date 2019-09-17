import java.util.Scanner;

public class Temp_conversion {
    public static void main(String[]args) {
        double current_temp_conversion_celsius;
        int current_fahrenheit;

        Scanner user_input= new Scanner(System.in);
        System.out.println("Please enter the Fahrenheit you would like converted");
        current_fahrenheit= user_input.nextInt();
        current_temp_conversion_celsius=(current_fahrenheit - 32) * (5.0/9);
        System.out.println("Fahrenheit= " +current_fahrenheit + " degrees fahrenheit" );
        System.out.println("Fahrenheit converted to Celsius= " +current_temp_conversion_celsius + " degrees celsius" );


    }
}
