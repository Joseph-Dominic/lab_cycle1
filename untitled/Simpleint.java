import java.util.Scanner;

public class Simpleint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final double data_limit =   30.0;

        System.out.println("Enter the used data: ");
        double remain = sc.nextInt();

        double remainingData = data_limit - remain;

        System.out.println("Remaining :" + remainingData);

    }
}