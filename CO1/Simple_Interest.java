import java.util.Scanner;

public class Simple_Interest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal");
        int principle = sc.nextInt();

        System.out.println("Enter the time");
        int time = sc.nextInt();

        System.out.println("Enter the rate");
        int rate = sc.nextInt();

        int SI = (principle * time * rate) / 100;

        System.out.println("Simple Interest: " + SI);
        System.out.println("Amount: " + (SI+ principle));

    }
}
