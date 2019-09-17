import java.util.Scanner;
public class Total_with_tax {
    public static void main(String[]args) {
        final double TAXRATE ;
        double price, sales_tax, total_cost;
        Scanner user_input= new Scanner(System.in);
        TAXRATE= 0.0825;
        System.out.println("Please Input the initial price of the item.");
        price= user_input.nextDouble();
        sales_tax= price * TAXRATE;

        total_cost= price + sales_tax;
        System.out.println("Price: " + price);
        System.out.println("Sales Tax: " + TAXRATE);
        System.out.println("Total: " + total_cost );


    }
}
