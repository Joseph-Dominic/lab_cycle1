import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean even = false;
        boolean odd = false;
        int sum = 0;

        for (int i = 0; i < password.length();i++){
            char ch = password.charAt(i);

            if (Character.isDigit(ch)){
               int digit = ch - '0';

               sum += digit;

               if(digit % 2 == 0){
                   even = true;
               }else{
                   odd = true;
               }
            }
        }

        if (password.length() >=6 && odd && even && sum >=20){
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
        }
    }

