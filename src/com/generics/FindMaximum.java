package com.generics;

// create generic class
public class FindMaximum<T extends Comparable> {
    T var1, var2, var3;

    /*
     *create constructor
     * If we want to initialize fields of the class with our own values, then use a parameterized constructor.
     */

    public FindMaximum(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    //main method

    public static void main(String[] args) {

        // 1st print welcome msg
        System.out.println("Welcome to Generic Program.");

        // taking variables for integer float string
        Integer a = 20, b = 50, c = 80;
        Float p = 20.85f, q = 90.55f, r = 80.98f;
        String e = "Apple", f = "Peach", g = "Banana";


        new FindMaximum<>(a, b, c).max();
        new FindMaximum<>(p, q, r).max();
        new FindMaximum<>(e, f, g).max();
    }

    // create max method
     private void max() {
        FindMaximum.getMaximum(var1, var2, var3);

    }

    /*
     create generic method the Generic Type extends Comparable
     */

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {

        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        //print maximum no and string

        System.out.println("Maximum ::" + max);

    }
}

