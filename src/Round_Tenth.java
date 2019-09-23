import java.util.Scanner;
/* Multiply 10 then divide /10 gives you the number rounded to the tenth

 */

public class Round_Tenth {

    public static void main(String[]args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Input the number you would like rounded to the nearest tenth: ");
       double initial_value =user_input.nextDouble();

        double unrounded_number = (initial_value * 10) + 0.5;

        double rounded_number=(int) unrounded_number / 10.0;

        System.out.println(initial_value + " rounded is " + rounded_number);
    }
}
