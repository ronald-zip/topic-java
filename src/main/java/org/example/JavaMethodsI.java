package org.example;

public class JavaMethodsI {

    // defined a method called sum with 2 parameters called "param1" & "param2"
    public int sum(int param1, int param2){
        int result = param1 + param2;

        // returned a result as data
        return result;
    }

    // defined a method without parameters, bc dont have anything to return
    public void greeting() {
        System.out.println("Hello im a method without parameter");
    }

    private static int ope(int a, int b){
        int resu = a+b;
        return resu;
    }

    public static void main(String[] args) {

        // inicialize 2 variables
        int a=10;
        int b=18;

        // create a new object to use sum method
        JavaMethodsI object = new JavaMethodsI();

        // asign a variable to catch return data to sum method
        int operation = object.sum(a,b);

        System.out.println("The result is equal to "+ operation);

        // print
        object.greeting();

        ope(a,b);

    }
}
