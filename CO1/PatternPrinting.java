import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}