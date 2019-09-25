import java.util.Scanner;
public class Correct_Change {

    public static void main(String[]args) {

        int  dollars, quarters, dimes, nickels, pennies, intial_amount_of_pennies, remaining;
        Scanner user_input= new Scanner(System.in);

        System.out.println("Please enter the amount of pennies you have:");
        intial_amount_of_pennies = user_input.nextInt();

        //intial_amount_of_pennies = 25x + 10x + 5x + 1x;
        remaining = intial_amount_of_pennies;
        dollars = intial_amount_of_pennies / 100;
        remaining-=dollars*100;
        quarters = remaining/25;
        remaining-=quarters*25;
        dimes = remaining/10;
        remaining-=dimes*10;
        nickels = remaining/5;
        remaining-=nickels*5;
        pennies = remaining;


        System.out.println(intial_amount_of_pennies+ " The amount of pennies the user inputed amounts to " + dollars + " dollars " + quarters +
                " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies ");




    }
}
