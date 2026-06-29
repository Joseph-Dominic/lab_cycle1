import java.util.Scanner;

public class Largest_of_three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        if (numb2 > numb1 && numb2 > numb3) {
            System.out.print(numb2 + " is Largest");
        }
        else if (numb3 > numb1 && numb3 > numb2){
            System.out.println(numb3 + " is largest");
        }else {
            System.out.println(numb1 + " is largest");
        }
    }
}