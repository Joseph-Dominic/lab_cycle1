class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(20,35,56));
        System.out.println(cal.add(10.22,30.35));
    }
}