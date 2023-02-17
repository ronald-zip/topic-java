package org.example;

public class JavaClassI {
    public static void main(String[] args) {

        // declare object car main method
        Car obj = new Car();

        // calling method callingcar into class car using obj object type car
        obj.callingcar();

    }

    static class Car{

        // declare velocity && name field
        float velocity = 20;
        String name = "Volkswagen";

        void callingcar(){

            // declare object car
            Car objectCar = new Car();
            System.out.println("Llamada auto " + objectCar.name);
        }
    }
}


