package com.generics;

public class FindMaximum {

    public static void main(String[] args) {
        //1st print welcome msg.
        System.out.println("Welcome to Find Maximum Problem using Generics");

        //variables
        Integer a = 20, b = 50, c =80;
        
        testMaximum (a,b,c); //calling method
    }

    /*
    create testMaximum method and passing parameter
     */
    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        /*
        checking the condition and finding maximum no
         */
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum Number is::"+max);
    }
}
