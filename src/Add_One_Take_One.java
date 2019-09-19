/*
The Class counts from the users selected number up to values. If the choosen value was 1 it would
print example: "1 2 3"
 */

import java.util.Scanner;
public class Add_One_Take_One {
    public static void main(String[]args) {
        int number_being_added_3_times;
        Scanner user_input = new Scanner(System.in);

        System.out.println("Please Input the number you would like added three times: ");
        number_being_added_3_times = user_input.nextInt();


        System.out.print(number_being_added_3_times++ +" ");
        System.out.print(number_being_added_3_times++ +" ");
        System.out.print(number_being_added_3_times++);


    }
}