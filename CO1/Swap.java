import java.util.Scanner;

public class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("A: " + a );
        System.out.println("B: " + b );

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("A: " + a );
        System.out.println("B: " + b );

    }
}