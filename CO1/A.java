class Base {
    void display(){
        System.out.println("Base");
    }
}

class B extends Base{
    @Override
    void display(){
        System.out.println("Child class 1");
    }
}

class C extends B{
    @Override
    void display(){
        System.out.println("Child class 2");
    }
}

public class A {
    public static void main(String[] args){
        Base b;


        b = new B();
        b.display();
        b = new C();
        b.display();





    }
}


