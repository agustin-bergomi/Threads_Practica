package com.agustinbergomi.lib_vehiculo;

public class Vehicle {

//    public String steer(String direction){
//        return direction;
//    }
    public void steer(String direction){
        System.out.println("You steered to the: " + direction);
    }
    public void changeGear(int gear){
        System.out.println("You changed to gear: " + gear);
    }
    public void accelerate(float speed){
        System.out.println("You accelerated to: " + speed);
    }
}
