import java.util.*;
public class function{
    public static void printHello(){
        System.out.println("Hello Jafar Ali");
        System.out.println("Hello Jafar Ali");
        System.out.println("Hello Jafar Ali");
        //agar mera return type void rahta hai to mujhe kuchh return karne ki jarurat nahi hai last me only return; bhi likh sakte hai aur dusre return type me kuchh return karna hota hai
    }

    public static void calculateSum(int num1, int num2){ //parameters or formal parameter
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
    // also write with return statement
    // public static int calculateSum(int num1, int num2){
    //     int sum = num1 + num2;
    //     return sum;
        
    // }

    //function for swapping two numbers
    public static void swap(int a, int b){
        //swap
        int temp = a;
         a = b;
         b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    //function for factorial number
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    //function for binomial cofficient n!/r! * n-r!
    public static int bincoff(int n, int r){
           int fact_n = factorial(n);
           int fact_r = factorial(r);
           int fact_nr = factorial(n-r);

            int bincoeff = fact_n / (fact_r * fact_nr);
            return bincoeff;
    }

    //function overloading
    //caculate sum of two numbers
    public static int sum(int a, int b){
        return a + b;
    }
    //calculate sum of three numbers with same function name
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //function for check if a number is prime or not
    public static boolean isPrime(int n){

        if (n == 2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return isPrime;
    }
    //function for check primes number in range
    public static void isPrimeRange(int p){
        for(int i=2; i<=p; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //function for converting binary to decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10; //binary number ko small karne ke liye
        }

        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    //function for converting decimal to binary
    public static void decToBin(int n){
        int myNumber = n;
        int power = 0;
        int binNum = 0;

        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, power));
            power++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNumber + " is " + binNum);
    }

    public static void main(String args[]){
        // printHello(); //function calling

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();

        // calculateSum(a, b); //arguments actual parameters

        //call through return statement
        // int sum = calculateSum(a, b);
        // System.out.println("Sum is " + sum);

        //swap value exchange
        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // int a = 5;
        // int b = 5;
        // int prod = multiply(a, b);
        // System.out.println("a * b " + prod);

        // prod = multiply(10, 5);
        // System.out.println("a * b " + prod);

        // System.out.println(factorial(4));
        // System.out.println(bincoff(5, 2));

        //function overloading calling
        // System.out.println(sum(5, 5));
        // System.out.println(sum(5, 5, 5));

        //checking prime number
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();

        // if(isPrime(number)){
        //     System.out.println(number + " is a prime number");
        // } else{
        //     System.out.println(number + " is not a prime number");
        // }

        //checking prime in range
        // isPrimeRange(20);

        //converting binary to decimal
        binToDec(101);

        //converting decimal to binary
        decToBin(10);





    }
}