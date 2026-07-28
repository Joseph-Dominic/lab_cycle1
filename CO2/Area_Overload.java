class Sample3{

    void area(int side){
        System.out.println("Area of Square: "+ (side * side));
    }

    void area(int length, int breadth){
        System.out.println("Area of Rectangle: "+ (length * breadth));
    }
}

public class Area_Overload {
    public static void main(String[] args){
        Sample3 s3 = new Sample3();

        s3.area(6);
        s3.area(12, 24);
    }
}