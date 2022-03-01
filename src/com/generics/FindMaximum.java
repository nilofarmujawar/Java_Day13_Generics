package com.generics;


public class FindMaximum {

    public static void main(String[] args) {

        // 1st print welcome msg.
        System.out.println("Welcome to Find Maximum Problem using Generics");

        //take variable float no.
        Float p = 20.85f, q = 90.55f, r = 80.98f;

        testMaximum(p, q, r);  //calling method
    }

    /*
    create testMaximum method and passing parameters.
     */
    private static void testMaximum(Float p, Float q, Float r) {
        Float max = p;

        /*
        check condition and find max float no
         */
        if (q.compareTo(p) > 0) {
            max = q;
        }
        if (r.compareTo(max) > 0) {
            max = r;
        }

        //print maximum float no.
        System.out.println("Maximum Number is: " + max);

    }

}