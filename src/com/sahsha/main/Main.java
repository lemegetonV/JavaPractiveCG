package com.sahsha.main;

import com.sahsha.myclasses.Variables;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //write your code here
//        System.out.println("My name is \"Amigo\".\n\nI agree to wages of $5000/month in the first year.\nI agree to wages of $5500/month in the second year.\nI agree to wages of $7000/month in the third year.\nI agree to wages of $8000/month in the fourth year.\nI agree to wages of $10000/month in the fifth year.\n\nKiss my shiny metal rear actuator!");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine(); // reads input from keyboard and returns as a string
//        String sYears = reader.readLine();
//        int num = Integer.parseInt(sYears); // coverts string value to an int
//
//        System.out.println(name);
//        System.out.println(sYears);
//        System.out.println(num);
//
//        System.out.println(name + " will take over the world in " + num + " years. Mwa-ha-ha!");

        Variables v1 = new Variables();
        Variables v2 = new Variables();

//        System.out.println(v1.classVariable1);
//        System.out.println(v1.classVariable2); // CANNOT ACCESS PRIVATE CLASS VARIABLE
        v1.printPrivateClassVariable();

//        System.out.println(v1.instanceVariable1 + " " + v2.instanceVariable1);
//        System.out.println(v1.instanceVariable2);

        v1.instanceVariable1++;
//        v1.instanceVariable2++;

        int result;
        result = v1.sumOfInstanceVariables();
//        System.out.println(result);

//        result = v1.productOfInstanceVariables();
//        System.out.println(result);

    }

}
