/*
Finds the average of fours numbers its put to the user to choose the three values.
 */
import java.util.Scanner;

public class Find_The_Average {

    public static void main(String[]args) {
        Scanner use_input = new Scanner(System.in);
        double num1, num2, num3, num4, average_of_the_4_numbers;
        final int amount_variables_divided = 4;


        System.out.println("Please type your first value: ");
        num1= use_input.nextDouble();
        average_of_the_4_numbers= num1;

        System.out.println("Please type your second value: ");
        num2= use_input.nextDouble();
        average_of_the_4_numbers += num2;

        System.out.println("Please type your third value: ");
        num3= use_input.nextDouble();
        average_of_the_4_numbers += num3;

        System.out.println("Please type your fourth value: ");
        num4= use_input.nextDouble();
        average_of_the_4_numbers += num4;
        average_of_the_4_numbers /= amount_variables_divided;

        System.out.println("The Average of the four numbers is: "+average_of_the_4_numbers);



    }





}
