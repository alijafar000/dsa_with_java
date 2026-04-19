import java.util.*;
public class recursion{
    public static void printDec(int n){
        //Base case
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
        
    }

    //recursion fn for calculating factorial
    public static int fact(int n){
        //Base case
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fact = n * fnm1;
        return fact;
    }

    //recursion for calculating sum of natural numbers
    public static int naturalSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = naturalSum(n-1);
        int sum = n + snm1;
        return sum;
    }

    //calculate fibnacci nth term
    public static int fibo(int n){

        //base cases
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //Check given array are sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        //for next all element
        return isSorted(arr, i+1);
    }

    //WAF to find first occurrence 
    public static int firstOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurrence(arr, key, i+1);
    }
    //WAF to find first occurrence
    public static int lastOccurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurrence(arr, key, i+1);

        if (isFound != -1){
            return isFound;
        }
        //check itself
        if(arr[i] == key){
            return i;
        }
        return -1;
    }

    //Find X^n using recursion
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    //tilling problem for 2Xn
    public static int tillingProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        // kam
        //vertical choice
        int fnm1 = tillingProblem(n-1);

        // horizontal choice //change here to change for anothe form like 4Xn change n-4
        int fnm2 = tillingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    //Friends pairing problem
    public static int friendsPairing(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        //work
        // //single
        // int fnm1 = friendsPairing(n-1);

        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totalways
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        // simple code
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    //Binary string problem
    public static void binaryString(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kam
        // yaha pe 0 ho sakta hai hamesha
        binaryString(n-1, 0, str+"0");

        if(lastPlace == 0){
            binaryString(n-1, 1, str+"1");
        }
    }

    //practice question of recursion

    // Question1: For a given integer array of size N.You have to find all the occurrences (indices) of a given element(Key)and print them.
    // Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
    // Sample Output: 1 5 7 8

    public static void allOccurrence(int arr[], int key, int i){
        //base case
        if(i == arr.length){
            return;
        }

        //kaam
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurrence(arr, key, i+1);
    }


    // Question 2 : You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.  Use a recursive function to solve this problem.NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
    // Sample Input: 1947
    // Sample Output: “one nine four seven”

    public static void printDigits(int number){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //base case
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;
        //number ko small kiya
        printDigits(number/10);
        System.out.print(digits[lastDigit] + " ");
    }

    // Question 3 :Write a program to find Length of a String using Recursion.
    public static int lengthString(String str){
        //base case
        if(str.length() == 0){
            return 0;
        }

        return lengthString(str.substring(1)) + 1;
    }



    public static void main(String args[]){
        int n = 10;
        // printDec(n);

        int n1 = 20;
        // printInc(n1);

        // System.out.println(fact(13));
        // System.out.println(naturalSum(10));
        // System.out.println(fibo(23));
        // System.out.println(fibo(24));
        // System.out.println(fibo(25));


        // int arr[] = {1,2,7,3,4,5,3};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurrence(arr, 3, 0));
        // System.out.println(lastOccurrence(arr, 3, 0));


        // System.out.println(power(2,5));     
        // System.out.println(tillingProblem(3));
        
        // System.out.println(friendsPairing(3));
        
        // binaryString(3, 0, "");


        //practice answers 1
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurrence(arr, key, 0);
        System.out.println();

        //practice answers 2
        printDigits(1234);
        System.out.println();

        //practice answers 3
        String str = "jafar";
        System.out.println(lengthString(str));

    }
}