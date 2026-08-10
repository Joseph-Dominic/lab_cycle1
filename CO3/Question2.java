import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;

    public void setDimensions(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        this.length = sc.nextInt();
        System.out.print("Enter the width: ");
        this.width = sc.nextInt();
    }
    public double calculateArea(){
        double area = length * width;
        return area;
    }

    public double calculatePerimeter(){
        double area = 2 * length + width;
        return  area;
    }
}

public class Question2 {
    public static void main(String[] args){
         Rectangle rect = new Rectangle();

          rect.setDimensions();
          System.out.println("Area: " + rect.calculateArea());
          System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
