import java.util.Scanner;
public class Pounds_To_kilograms {

    public static void main(String[] args) {

        double lbs, kgs;
        final double CONVERSION_NUMBER;
        Scanner user_input= new Scanner(System.in);

        System.out.println("Please Input the amount of lbs you want converted");
        lbs= user_input.nextDouble();
        CONVERSION_NUMBER= 2.205;
        kgs= lbs/ CONVERSION_NUMBER;
        System.out.println((lbs) + " Pounds = "+ (kgs)+ " Kilograms");

    }
}