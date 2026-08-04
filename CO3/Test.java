// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass
class Dog extends Animal {
    void eat() {
        super.eat();
        System.out.println("Dog is eating.");

    }
}

// Main
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

