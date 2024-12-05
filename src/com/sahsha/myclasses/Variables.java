package com.sahsha.myclasses;

public class Variables {

    public static String classVariable1 = "HELLO!";
    private static String classVariable2 = "HELLO AGAIN!";

    public int instanceVariable1;
    int instanceVariable2;

    public int sumOfInstanceVariables() {
        int sum = instanceVariable1 + instanceVariable2;
        return sum;
    }

    int productOfInstanceVariables() {
        int product = instanceVariable1 * instanceVariable2;
        return product;
    }

    public void printPrivateClassVariable() {
        System.out.println(classVariable2);
    }

    public Variables() {
        instanceVariable1 = 10;
        instanceVariable2 = 20;
    }

}
