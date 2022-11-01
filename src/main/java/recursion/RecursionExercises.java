package recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursionExercises {
    public static Map<Integer, Integer> executions = new HashMap<>();
    public static void main(String[] args) {
        // print all numbers from n to 0;
        printRecursivelynumbers(10);

        // compute sum of all numbers from (n to 1)

        sumRecursivelyNumbers(5);

        // fibonacci 1, 1, 2, 3, 5, 8, 13....


        System.out.println(fibonacci(6));
    }

    private static int fibonacci(int n){

        executions.putIfAbsent(n,0);
        executions.get(n);
        if(n==0 || n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int sumRecursivelyNumbers(int n){
        //exit condition
        if(n==1){
            return 1;
        }
        return n + sumRecursivelyNumbers(n-1);
        // n + sumRecursivelynumbers(n-1)
        // n +(n-1) + sumRecursivelynumbers(n-2)
        // n+(n-1)+(n-2) + sumRecursivelynumbers(n-1)
        // ...
        // n + (n-1) + (n-2) + ......... + 2 + sumRecursivelyNumbers(1)
        // n + (n-1) + (n-2) + ...... + 2 +1
    }

    private static void printRecursivelynumbers(int n){
        if(n==-1){
            return;
        }
        // part 1 : print n
        System.out.println(n);

        // part 2 : print all numbers from (n-1) to 0;

        printRecursivelynumbers(n-1);
    }
}
