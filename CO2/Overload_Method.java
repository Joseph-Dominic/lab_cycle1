class Sample2{
    void display(int num){
        System.out.println("Integer: " + num);
    }

    void display(double num){
        System.out.println("Double: " + num);
    }

    void display(String text){
        System.out.println("String: " + text);
    }
}

public class Overload_Method {
    public static void main(String[] args){
        Sample2 s = new Sample2();

        s.display(10);
        s.display(20.5);
        s.display("Java");
    }
}