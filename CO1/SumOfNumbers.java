import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int value = s.nextInt();
        int length = String.valueOf(value).length();
        int temp = value;
        int aff_add = 0;
        for (int i = 0; i <= length; i++) {
            int digit = temp % 10;
            temp = temp / 10;
            aff_add = aff_add + digit;

        }
        System.out.println(aff_add);
    }
}