import java.util.Scanner;
public class Rectangular_area {

    public static void main(String[] args) {

        int length, width;
        double area;
        Scanner user_input= new Scanner(System.in);
        System.out.println("Please input a room width= ");
        length= user_input.nextInt();
        System.out.println("Now, please input a room width= ");
        width= user_input.nextInt();
        area= length*width;
        System.out.println("The Area = "+ (area));


    }
}