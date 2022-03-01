package com.generics;

// create generic class
public class FindMaximum <T extends Comparable<T>> {

    // create genterics maxmumValue method and passing parameters

    public static <T extends  Comparable <T>>  T maximumValue( T val1 , T val2, T val3 ,T val4,T val5) {

        T max = val1;

        /*
        check condition
         */
        if (val2.compareTo(max) > 0 ) {
            max = val2;
        } if (val3.compareTo(max) > 0){
            max = val3;
        }if (val4.compareTo(max) > 0 ){
            max = val4;
        }if (val5.compareTo(max) > 0){
            max = val5;

        }
        return max;
    }

    public static void main(String[] args) {

// create object for FindMaximum class object name is max

        FindMaximum max = new FindMaximum();

        //print maximum value
        System.out.println( "The maximum value is :: "+maximumValue(2.5f,3.5f,4.5f,5.5f,6.5f));


    }
}