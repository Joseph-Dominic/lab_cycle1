class Animal2 {
    Animal2() {
        System.out.println("Animal Constructor");
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super();
        System.out.println("Dog Constructor");
    }
}

public class Cat {
    public static void main(String[] args) {
        Dog2 d = new Dog2();

    }
}

