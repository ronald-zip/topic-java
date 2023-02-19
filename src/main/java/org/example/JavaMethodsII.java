package org.example;

public class JavaMethodsII {
    // Java Method Overloading

    // define method without param
    public static void operation() {
        System.out.println("Iniciate a operation");
    }

    // define method with 1 param
    public static int operation(int c){
        int res = c*c;
        return res;
    }

    // define method with 2 param
    public static double operation(double a, double b){
        double result = a + b;
        return result;
    }

    public static void main(String[] args) {

        // declare 3 methods with same name, but each one works diferente form, from data recived as parameters

        operation();
        System.out.println("Result on multiplication to " + operation(7));
        System.out.println("Result on adition to " + operation(12, 34));
    }
}
