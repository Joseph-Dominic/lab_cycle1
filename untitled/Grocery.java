import java.util.Scanner;

public class Grocery {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final double discount = 0.10;

        System.out.println("Price of item 1 :");
        double item1 = sc.nextDouble();

        System.out.println("Price of item 2 :");
        double item2 = sc.nextDouble();

        System.out.println("Price of item 3 :");
        double item3 = sc.nextDouble();

        double total = (item1 + item2 + item3);
        double  discountAmount = total * discount;
        double final_amount = total - discountAmount;

        System.out.println("Total: " + total);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Amount: " + final_amount);


    }
}