package com.agustinbergomi.lib_vehiculo;

public class MyClass {

    public static void main(String[] args) {

//        Creo un auto con el constructor de auto.
        Car comun1 = new Car();
        Car audi1 = new AudiCar();

        comun1.accelerate(234);
        comun1.changeGear(2);
        comun1.steer("right");

        audi1.accelerate(123);
        audi1.changeGear(3);
        audi1.steer("left");

        AudiCar audi2 = new AudiCar();

        audi2.abrirBaul();



    }
}