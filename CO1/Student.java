import java.util.Scanner;

public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the rollno: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the course: ");
        String course = sc.nextLine();

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();


        System.out.println("Student Details");
        System.out.println("______________________" );
        System.out.println("Name       :" + name);
        System.out.println("Roll No    : " + roll_no);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);
        System.out.println("______________________" );

    }
}
