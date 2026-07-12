import java.util.Scanner;

public class Age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current year: ");
        int current_year = sc.nextInt();

        System.out.print("Enter the birth year: ");
        int birth_year = sc.nextInt();

        int age = current_year - birth_year;

        System.out.println("Age:" + age);
    }
}