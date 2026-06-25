import java.util.Scanner;

public class Count_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int zero = 0;

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter the array elements: ");
            arr[i] = sc.nextInt();

            if (arr[i] > 0){
                positive = positive + 1;
            } else if (arr[i] < 0) {
                negative = negative +1;
            }else {
                zero = zero +1;
            }
        }
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero: " + zero);
    }
}