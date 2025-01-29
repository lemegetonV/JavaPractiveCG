package com.sahsha.myclasses;

public class Sample {

    // class will have variables and methods

    // "static" or "class" variables (created only once at start of program)
    public static String classVariable1 = "HELLO!"; // public class variable (visible)
    static String classVariable2 = "HELLO AGAIN!"; // package-private class variable (hidden in other package)
    private static String classVariable3 = "HELLO ONCE AGAIN!"; // private class variable (fully hidden)


    // "instance" variables (created whenever an object is created)
    public int instanceVariable1; // public instance variable
    int instanceVariable2; // package-private instance variable
    private int instanceVariable3; // private instance variable

    // public instance method
    public int sumOfInstanceVariables() {
        int sum = instanceVariable1 + instanceVariable2 + instanceVariable3;
        return sum;
    }

    // package-private instance method
    int productOfInstanceVariables() {
        int product = instanceVariable1 * instanceVariable2 * instanceVariable3;
        return product;
    }

    // private instance method
    private int averageOfInstanceVariables() {
        int average = (instanceVariable1 + instanceVariable2 + instanceVariable3)/3;
        return average;
    }

    // we can access/modify PRIVATE and PACKAGE-PRIVATE variables within the class methods only and not outside the class
    // BTW this is a "static" or class method
    public static void printPrivateClassVariables() {
        System.out.println(classVariable2);
        System.out.println(classVariable3);
    }

    // Class may contain a constructor method
    public Sample() {
        instanceVariable1 = 10;
        instanceVariable2 = 20;
        instanceVariable3 = 30;
    }

}
