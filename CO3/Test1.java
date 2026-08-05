// Superclass
class Animal1 {
    String name = "Animal";
}

// Subclass
class Dog1 extends Animal1 {
    String name = "Dog";
    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }
}

// Main
public class Test1 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.display();
    }
}

