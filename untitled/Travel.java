import java.util.Scanner;

public class Travel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Distance in km :");
        int km = sc.nextInt();

        System.out.println("Enter the mileage: ");
        int mileage = sc.nextInt();

        System.out.println("Petrol price: ");
        int price = sc.nextInt();

        int fuelNeeded = km / mileage;
        int cost = fuelNeeded * price;

        System.out.println("Fuel needed = " + fuelNeeded + " liters");
        System.out.println("Cost: " + cost);


    }
}