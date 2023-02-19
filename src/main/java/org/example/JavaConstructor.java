package org.example;

class ConstructorII{
    String variable;

    public ConstructorII(){
        System.out.println("Constructor start //");
        variable = "phone";
    }
}

class ConstructorIII{
    int num;

    ConstructorIII(int b){
        num = b;
        System.out.println("The number is "+num);
    }
}


public class JavaConstructor {
    private String name;

    JavaConstructor() {
        System.out.println("Constructor start");
        name = "Ale";
    }

    public static void main(String[] args) {

        // Works with construct I
        System.out.println("Iniciate constructor 1");
        JavaConstructor javaConstructor = new JavaConstructor();
        System.out.println("My name is "+javaConstructor.name);

        // Works with construct II
        System.out.println("Iniciate constructor 2");
        ConstructorII constructorII = new ConstructorII();
        System.out.println("Data is "+constructorII.variable);

        // Works with construct III
        System.out.println("Iniciate constructor 3");
        ConstructorIII constructor1 = new ConstructorIII(3);
        ConstructorIII constructor2 = new ConstructorIII(5);
        ConstructorIII constructor3 = new ConstructorIII(2783);

    }

}
