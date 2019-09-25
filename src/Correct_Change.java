import java.util.Scanner;
public class Correct_Change {

    public static void main(String[]args) {

        int  dollars, quarters, dimes, nickels, pennies, intial_amount_of_pennies;
        Scanner user_input= new Scanner(System.in);

        System.out.println("Please enter the amount of pennies you have:");
        intial_amount_of_pennies = user_input.nextInt();

        //intial_amount_of_pennies = 25x + 10x + 5x + 1x;

        dollars=intial_amount_of_pennies / 100;
        intial_amount_of_pennies %25 = quarters;
        intial_amount_of_pennies %10 = dimes;
        intial_amount_of_pennies %5 = nickels;
        intial_amount_of_pennies = pennies;



        System.out.println("The amount of pennies the user inputed amounts to" + dollars + "dollars" + quarters +
                "quarters" + dimes + "dimes" + nickels + "nickels" + pennies + "pennies");




    }
}
