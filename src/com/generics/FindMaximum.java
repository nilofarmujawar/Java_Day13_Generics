package com.generics;

public class FindMaximum {
    public static void main(String[] args) {

        //1st print welcome msg.
        System.out.println("Welcome to Find Maximum Problem using Generics");

        //take variables strings
        String e = "Apple", f = "Peach" , g = "Banana";

        /*
        calling directly without creating object coz testMaximum method also static.
         */
        testMaximum (e,f,g);//calling method
    }

    /*
    creating testMaximum method and passing parameter in string type
     */

    private static void testMaximum(String e, String f, String g) {
        String max = e;

        /*
        check condition comparing and finding max string
         */
        if(f.compareTo(e)>0){
            max = f;
        }
        if(g.compareTo(max)>0){
            max = g;
        }

        //print maximum string
        System.out.println("Maximum String is: "+max);

    }

}
