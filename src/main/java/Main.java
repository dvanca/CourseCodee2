import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int number =20;
        int sum = addNumbers(number);
        System.out.println("sum is = " + sum);

        int sum1 = addEvenNumbers(9);
        System.out.println("sum of even is = " + sum1);

        String string = "kayak";
        System.out.println("is string " + string + " palindrome? " +" it is  "+ checkPalindrome(string));

        System.out.println(reverseString("masina"));

        System.out.println(sumOfDigits(123));
        System.out.println(fibbonacyArray(6));
    }

    public static int addNumbers(int num){
        if(num!=0){
            return num + addNumbers(num-1);
        }else{
            return num;
        }
    }

    public static int addEvenNumbers(int num){
        if(num!=0 && num %2 ==0){
            return num + addEvenNumbers(num-2);
        }else{
            return 0;
        }
    }

    public static boolean checkPalindrome(String s){
        if(s.length()==0 || s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return checkPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }

    public static String reverseString(String s){
        if(s.length()==0){
            System.out.println("String is empty");
            return s;
        }else{
            return reverseString(s.substring(1))+s.charAt(0);
        }
    }

    public static int sumOfDigits(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return n%10 + sumOfDigits(n/10);
        }
    }

    public static int fibbonacyArray(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            return fibbonacyArray(n-1)+fibbonacyArray(n-2);
        }
    }
}
