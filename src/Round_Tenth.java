import java.util.Scanner;
/* Multiply 10 then divide /10 gives you the number rounded to the tenth

 */

public class Round_Tenth {

    public static void main(String[]args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Input the number you would like rounded to the nearest tenth: ");
        double unrounded_number = user_input.nextDouble();

        double rounded_number = (int) (unrounded_number + 0.05);

        System.out.println(unrounded_number + " rounded is " + rounded_number);
    }
}
