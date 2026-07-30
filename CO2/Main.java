class Rectangle{
    int l = 10;
    int b = 10;
    Rectangle(){
        System.out.println("Area:" + (l * b));
    }

    Rectangle(int l , int b){
        this.l = l;
        this.b = b;
        System.out.print("Area:" + (l * b));
    }
}

public class Main {
    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        Rectangle rc = new Rectangle(20, 20);
    }
}
