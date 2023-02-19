package org.example;

public class JavaConstuctorOverload {
    public static void main(String[] args) {
        One obj1 = new One();
        One obj2 = new One(7.8);
        One obj3 = new One(3.14, 6);

    }
}

class One{
    double paramB;
    int paramA;

    One(){
        this.paramB = 9;
        System.out.println("Constructor Overload without parameter");

    }

    One(double x){
        this.paramB = x;
        System.out.println("Constructor Overload with parameter value is "+ this.paramB);
    }

    One(double z, int y){
        this.paramB = z;
        this.paramA = y;
        System.out.println("Constructor Overload with parameters z= "+this.paramB + " y= "+this.paramA);
    }
}