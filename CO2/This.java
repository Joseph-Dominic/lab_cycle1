class Sample{
    String name;
    int age;

    Sample(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("Student Name:" + this.name);
        System.out.println("Age:" + this.age);

    }
}

public class This{
    public static void main(String[] args){
        Sample sa = new Sample("Anu", 20);
    }
}