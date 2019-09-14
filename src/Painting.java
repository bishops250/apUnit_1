/* A.B September 13,2019
Solves for the amount of paint needed to paint a room.
 */

public class Painting {

public static void main(String[]args) {
     int room_length;
     int room_width;
     int room_height;
     double room_area;
     int window_area;
     int door_area;
     double amount_paint_needed;
     int number_doors;
     int number_windows;
     int gallons_per_paint_area;

    room_length = 32;
    room_width = 40;
    room_height = 16;
    number_doors = 2;
    number_windows = 4;
    door_area = 20 * number_doors;
    window_area = 15 * number_windows;
    gallons_per_paint_area = 350;
    room_area= (room_height * room_length)*(2) + (room_width * room_height)*(2) + (room_length* room_width) -
            (door_area + window_area);
    amount_paint_needed = room_area / gallons_per_paint_area;


    System.out.println("The amount of paint you need to paint the room is " + amount_paint_needed + " gallons of paint.");



}
}