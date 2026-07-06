import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Calculator Menu =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number (A): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (B): ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero is not possible.");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}