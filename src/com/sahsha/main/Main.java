package com.sahsha.main;
import com.sahsha.myclasses.Sample;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // object to take KB input
//        String name = reader.readLine(); // reads input from keyboard and returns it as a string
//        String sYears = reader.readLine();
//        int num = Integer.parseInt(sYears); // coverts string value to an int
//
//        System.out.println(name);
//        System.out.println(sYears);
//        System.out.println(num);

        System.out.println(args); // args is a "method parameter or argument" (scope is throughout the entire method lifecycle)

        int result = 0; // This is a "method variable" or "local variable" (scope starts from this line to end of the method)

        // This is an if-else code block
        if(result>=0) {
            int resultCopy = result; // This is a variable inside a code-block (scope only within the block)
            System.out.println(resultCopy);
        }


        // we can access/modify the PUBLIC class variable directly without creating an object
        System.out.println(Sample.classVariable1);
        Sample.classVariable1 = "NEW STRING";

        // we CANNOT access/modify the PACKAGE-PRIVATE class variable if class file is not in the same package
        //System.out.println(Sample.classVariable2); // ERROR

        // we CANNOT access/modify the PRIVATE class variable outside the class
        //System.out.println(Sample.classVariable3); // ERROR

        // We can use a "method" defined inside the class to access the PRIVATE and PACKAGE-PRIVATE class variables
        // Also this is a "static" or class method, so we can call it without creating an object
        Sample.printPrivateClassVariables();

        // v1 is an object of the class Sample
        Sample v1 = new Sample();

        // we can access/modify the PUBLIC instance variables of object
        v1.instanceVariable1++;
        System.out.println(v1.instanceVariable1);

        // we cannot access/modify instance variables and methods without creating object (it's not "static")
        //System.out.println(Sample.instanceVariable1); // ERROR
        //result = Sample.sumOfInstanceVariables(); // ERROR

        // we CANNOT access/modify the PACKAGE-PRIVATE instance variable of object if class file is not in same package
        //v1.instanceVariable2++; // ERROR
        //System.out.println(v1.instanceVariable2); // ERROR

        // we CANNOT access/modify the PRIVATE instance variable of object outside the class
        //v1.instanceVariable3++; // ERROR
        //System.out.println(v1.instanceVariable3); // ERROR

        // we can call a PUBLIC instance method of an object
        result = v1.sumOfInstanceVariables(); // we are storing the value returned by method to a local variable

        // we CANNOT call the PACKAGE-PRIVATE instance method of object if class file is not in same package
        //result = v1.productOfInstanceVariables(); // ERROR

        // we CANNOT call the PRIVATE instance method of object outside the class
        //result = v1.averageOfInstanceVariables(); // ERROR

        // creating 3 objects of the class Sample
        Sample v100 = new Sample();
        Sample v200 = new Sample();
        Sample v300 = new Sample();

        // instance variables of each object are independent of each other
        v100.instanceVariable1 = 1000;
        v200.instanceVariable1 = 2000;
        v300.instanceVariable1 = 3000;
        System.out.println(v100.instanceVariable1);
        System.out.println(v200.instanceVariable1);
        System.out.println(v300.instanceVariable1);

        // class variable value is same for all objects
        Sample.classVariable1 = "CHANGED";
        System.out.println(v1.classVariable1);
        System.out.println(v100.classVariable1);
        System.out.println(v200.classVariable1);
        System.out.println(v300.classVariable1);

        v200.classVariable1 = "CHANGED AGAIN";
        System.out.println(v1.classVariable1);
        System.out.println(v100.classVariable1);
        System.out.println(v200.classVariable1);
        System.out.println(v300.classVariable1);

    }

}
