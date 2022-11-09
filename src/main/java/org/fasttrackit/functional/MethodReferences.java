package org.fasttrackit.functional;

import java.util.Locale;
import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        printSomethingInACertainWay((s, p) -> s.toLowerCase());
        printSomethingInACertainWay((s, p )-> s.toUpperCase());

    }

    public static void printSomethingInACertainWay(MyFunction howToPrint){
        //hello
        //another 100 lines of code
        System.out.println(howToPrint.transform("hello", "cucu"));
    }

}
