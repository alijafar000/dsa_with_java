import java.util.*;
public class Basic1{
    public static void main(String args[]){

        //Conditional statement

        // int age = 16;
        // if (age >= 18){
        //     System.out.println("Adult");
        //  }
        // if (age > 13 && age < 18){
        //     System.out.println("Teenager");
          
        // } 
        // else{
        //     System.out.println("Not Adult");
        // }

        //Check even or odd
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num % 2 == 0){
        //     System.out.println("Given number are even");

        // }else{
        //     System.out.println("Given number are odd");
        // }

        //Income tax calculator
        // Scanner tx = new Scanner(System.in);
        // int income = tx.nextInt();
        // int tax;

        // if (income < 500000){
        //     tax = 0;
        // } 
        // else if(income >= 500000 && income < 1000000){
        //     tax =  (int) (income * 0.2);
        // } 
        // else{
        //     tax = (int) (income * 0.3);
        // }
        // System.out.println("Your tax is:" + tax);

        //Checking largest in 3 numbers
        // int a = 10, b = 210, c = 30;
        // if(a>=b && a>=c){
        //     System.out.println("A is greater");
        // }
        // else if(b>=c){
        //     System.out.println("B is greater");
        // }
        // else{
        //     System.out.println("C is greater");
        // }

        //Checking a student is pass or fail using ternary operator
        // int marks = 25;
        // String result = (marks >= 33)? "You Pass": "You Fail";
        // System.out.println(result);

        // int numbers = 2;
        // switch (numbers){
        //     case 1: System.out.println("Bread");
        //             break;
        //     case 2: System.out.println("Burger");   
        //             break;
        //     case 3: System.out.println("Banana");  
        //             break;
        //     default: System.out.println("We wake up");      
        // }

        //Calculator using switch statement
        // Scanner cal = new Scanner(System.in);
        // System.out.println("Enter number a:");
        // int num1 = cal.nextInt();
        // System.out.println("Enter number b");
        // int num2 = cal.nextInt();
        // System.out.println("Enter operator like: +, -, *, /, %");
        // int operands = cal.next().charAt(0);

        // switch(operands){
        //     case '+': System.out.println(num1+num2);
        //             break;
        //     case '-': System.out.println(num1-num2);  
        //             break;
        //     case '*': System.out.println(num1*num2);
        //             break;
        //     case '/': System.out.println(num1/num2);
        //             break;
        //     case '%': System.out.println(num1%num2);
        //             break;
        //     default: System.out.println("Wrong operands");            
        // }

        //Loops while, for and do while
        // while

        // int counter = 0;
        // while (counter < 10){
        //         System.out.println("Hello Java");
        //         counter++;
        // }
        
        //print number 1 to 10
        // int counter1 = 1;
        // while (counter1 <= 10){
        //         System.out.println(counter1);
        //         counter1++;
        // }

        //print number 1 to n
        // int num = 1;
        // System.out.print("Enter a number ");
        // Scanner sc = new Scanner(System.in);
        // int newNum = sc.nextInt();
        // while (num <= newNum){
        //         System.out.println(num);
        //         num++;

        // }

        //print sum of first n natural number
        // int i = 1;
        // int sum = 0;
        // System.out.println("Enter a number");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // while(i <= n){
        //         sum = sum + i;
        //         i++;
         
        // }
        //  System.out.println("Sum is:" + sum);  

        //for loop
        // for(int i=1; i<=10; i++){
        //         System.out.println("Hello Java");
        // } 

        //printing square pattern
        // for(int line=1; line<=5; line++){
        //         System.out.println("* * * * *");
        // }

        //print a reverse of a number
        // int n = 145666;

        // while (n > 0){
        //         int lastDigit = n % 10;
        //         System.out.print(lastDigit);
        //         n = n / 10;
        // }
        
        //do while loop
        // int counter = 1;

        // do{
        //         System.out.println("Hello Javascript");
        //         counter++;
        // } while(counter <= 10);

        //break statement
        // for(int i=0; i<=5; i++){
        //         if (i == 3){
        //                 break;
        //         }
        //         System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        //keep entering numbers till user enter a multiple of 10
        // Scanner sc = new Scanner(System.in);
        

        // do{
        //         System.out.print("Enter a number ");
                
        //         int n = sc.nextInt();
        //         if(n % 10 == 0){
        //                 break;
        //         }
        //         System.out.println(n);
        // } while(true);

        //continue statement
        //Display all numbers enter by user except multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do{
        //         System.out.print("Enter a number: ");
        //         int n = sc.nextInt();
        //         if (n % 10 == 0){
        //                 continue;
        //         }
        //         System.out.println("Number was " + n);

                
        // }while(true);

        //Check if number is prime or not

        Scanner pr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pr.nextInt();
        
        if (num == 2){
                System.out.println(num + " is prime number");
        } else{
                boolean isPrime = true;
                for(int i=2; i<=num-1; i++){
                        if (num % i == 0){
                        isPrime = false;
                        }
                }
                 if(isPrime == true){
                        System.out.println(num + " is prime number");
                 }else{
                        System.out.println(num + " is not prime number");
                 }
        }

}
}