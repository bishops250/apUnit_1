import java.util.Scanner;

public class Round_Negatives {
    public static void main(String[]args) {
        Scanner user_input = new Scanner(System.in);



        System.out.println("Please Input the number you would like rounded: ");
        double unrounded_number = user_input.nextDouble();

        double rounded_number = (int) (unrounded_number - 0.5);

        System.out.println(unrounded_number + " rounded is " + rounded_number);
    }
}
