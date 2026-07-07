import java.util.Scanner;

public class Max_Element_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];

        for(int i = 0; i<n; i++ ){
            System.out.print("Enter array elements:");
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("The largest element is: " + max);
    }
}