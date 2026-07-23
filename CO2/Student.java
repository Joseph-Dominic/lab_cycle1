class Sample1{
    Sample1(){
        this("Manu", 23);
        System.out.println("Default Constructor");
    }

    Sample1(String name, int age){
        System.out.println("Parameterized Constructor");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

public class Student {
    public static void main(String[] args){
        Sample1 sa1 = new Sample1();
    }
}