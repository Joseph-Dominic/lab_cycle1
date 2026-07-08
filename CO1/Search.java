import java.util.Scanner;

public class Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array Elements are: ");
        for (int i = 0; i<num; i++){
            System.out.println(arr[i]);
        }

        System.out.print("Enter the Element you want to search: ");
        int n = sc.nextInt();

        boolean found = false;

        for (int i = 0; i <num; i++){
            if (arr[i] == n){
                System.out.println("Element found at position: " + (i+1));
                found = true;
                break;
            }
            }

        if (!found){
            System.out.println("Element not present in the array");
        }
        }
    }