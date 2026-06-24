import java.util.Scanner;

public class Arithmetic_operations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));
        System.out.println("Quotient: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));
    }

}