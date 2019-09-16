public class Total_with_tax {
    public static void main(String[]args) {
        final double TAXRATE ;
        double price, sales_tax, total_cost;
        TAXRATE= 0.0825;
        price= 52.75;
        sales_tax= price * TAXRATE;

        total_cost= price + sales_tax;
        System.out.println("Price: " + price);
        System.out.println("Sales Tax: " + TAXRATE);
        System.out.println("Total: " + total_cost );


    }
}
