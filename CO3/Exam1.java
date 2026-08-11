import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter an integer");
        int a = sc.nextInt();
        System.out.println("Number ranging from " + a + " to " + 1);

        for (int i = a; i >=1; i--) {
            System.out.println(i);

            if (i % 2 != 0) {
                sum = sum + i;
            }

            if (i % 4 == 0) {
                count++;
            }
        }

        System.out.println("Sum of all odd numbers: " + sum);
        System.out.println(" Numbers that are divisible by 4: " + count);
    }
}