 class Vehicle{
    Vehicle(){
        System.out.println("This is Vehicle Class");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is Car class");
    }
}

public class VehicleMain{
    public static void main(String[] args){
        Car onj = new Car();
    }
}
