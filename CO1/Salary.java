import java.util.Scanner;

public class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary");
        int basic = sc.nextInt();

        double DA = 0.10 * basic;
        double HRA = 0.15 * basic;

        double salary = basic + DA + HRA;

        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + salary);
    }
}