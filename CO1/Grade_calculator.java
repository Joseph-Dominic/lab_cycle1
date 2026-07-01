import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int mark = sc.nextInt();
        int grade = mark / 10;

        switch (grade){
            case 10:
            case 9:
                System.out.print("Grade = A");
                break;

            case 8:
                System.out.print("Grade = B");
                break;

            case 7:
                System.out.print("Grade = C");
                break;

            default:
                System.out.print("Grade = D");

        }
    }
}