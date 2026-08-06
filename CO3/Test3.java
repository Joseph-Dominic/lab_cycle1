class Animal3 {
    String name;
    Animal3(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    Dog3(String name) {
        super(name);
    }
    void display() {
        System.out.println(name);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Dog3 d = new Dog3("Tommy");   //object,constructor  of the derived class
        d.display();
    }
}

