package Ex2_method_overloading;

class Vehicle {
    public void foo(Object obj) {
        System.out.println("Vehicle.foo(obj ..)");
    }
}

class Car extends Vehicle {
    public void foo(Object obj) {
        System.out.println("Car.foo(obj ..)");
    }
    public void foo(int obj) {
        System.out.println("Car.foo(int ..)");
    }
}

public class Example2StaticBinding {
    public static void main(String[] args) {
       // Overloading is resolved at compile time.
       // Method is bound dynamically.
       Vehicle vehicle = new Car();
       vehicle.foo(1);
    }
}



