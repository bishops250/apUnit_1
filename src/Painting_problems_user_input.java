/* A.B September 13,2019
Solves for the amount of paint needed to paint a room.
The code Imports Java.util.Scanner to
allow User Input for the different variables

 */

import java.util.Scanner;


public class Painting_problems_user_input {

    public static void main(String[]args) {
        Scanner input= new Scanner(System.in);
        double room_length;
        double room_width;
        double room_height;
        double room_area;
        double window_area;
        double door_area;
        double amount_paint_needed;
        int number_doors;
        int number_windows;
        final double GALLONS_PER_PAINT_AREA;

        System.out.println("\t\t\tA.B Amount of Paint Calculator!!!");
        System.out.println("The program that calculates the number of gallons needed to paint the walls\n" +
                " of a room given its length, width, and height.\n ");


        System.out.println("Please input a room length.");
        room_length = input.nextDouble();
        System.out.println("You set the room length to "+ room_length +" ft.");


        System.out.println("Please input a room Width.");
        room_width = input.nextDouble();
        System.out.println("You set the room width to "+ room_width +" ft.");


        System.out.println("Please input a room height.");
        room_height = input.nextDouble();
        System.out.println("You set the room height to "+ room_height +" ft.");


        System.out.println("Please input the number of doors.");
        number_doors = input.nextInt();
        System.out.println("You set the room doors to "+ number_doors +" ft.");


        System.out.println("Please input a number of windows");
        number_windows = input.nextInt();
        System.out.println("You set the number of windows to "+ number_windows +" ft.");


        door_area = 20 * number_doors;
        window_area = 15 * number_windows;
        GALLONS_PER_PAINT_AREA = input.nextDouble();
        room_area= (room_height * room_length)*(2) + (room_width * room_height)*(2) + (room_length* room_width) -
                (door_area + window_area);
        amount_paint_needed = room_area / GALLONS_PER_PAINT_AREA;


        System.out.println("The amount of paint you need to paint the room is " + amount_paint_needed + " gallons of paint.");
    }
}
