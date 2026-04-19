import java.util.*;
public class Practice{
  // write a Java method to compute the average of three numbers..

  public static double average(double a, double b, double c){
    return (a + b + c) / 3;
  }

  // Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise.

  public static boolean isEven(int num){
    return num % 2 == 0;
  }

  // Write a Java method to compute the sum of the digits in an integer.
  public static int sumDigit(int n){
    int sumOfDigits = 0;
    while(n>0){
      int lastDigit = n % 10;
      sumOfDigits += lastDigit;
      n /= 10;
    }
    return sumOfDigits;
  }

  // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  public static boolean containsDuplicate(int nums[]){
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
          if(nums[i] == nums[j]){
            return true;
          }
        }
    }
    return false;
  } 

  // Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
  // height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]

  public static int trappedRainWater(int heights[]){
    int n = heights.length;
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];

    for(int i=1; i<n; i++){
      leftMax[i] = Math.max(heights[i], leftMax[i-1] ); 
    }

    int rightMax[] = new int[n];
    rightMax[n-1] = heights[n-1];

    for(int i=n-2; i>=0; i--){
      rightMax[i] = Math.max(heights[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    for(int i=0; i<n; i++){
      int waterLevel = Math.min(leftMax[i], rightMax[i]);

      trappedWater += waterLevel - heights[i];
    }
    return trappedWater;
  }
    public static void main(String args[]){
        //Average of 3 inputs number
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int avg = (a + b + c) / 3;
        // System.out.println("Average of 3 inputs are:" + avg);

        //Area of a square (Formula = side * side)

        // Scanner sc = new Scanner(System.in);
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("Area of square is:" + area);

        //Bill of items pen, pencil & eraser in float

        // Scanner fl = new Scanner(System.in);
        // float pen = fl.nextFloat();
        // float pencil = fl.nextFloat();
        // float eraser = fl.nextFloat();

        // float bill = pen + pencil + eraser;
        // System.out.println("Your total bill is:" + bill);

        // with 18% gst

        // float newBill = bill + (0.18f * bill);
        // System.out.println("Bill with GST:" + newBill);

        // int x = 2, y = 5;
        // int exp1 = (x * y / x);  o/p - 5
        // int exp2 = (x * (y / x)); o/p - 4
        // System.out.print(exp1);
        // System.out.print(exp2);


        //check a number is positive or negative
        // Scanner nm = new Scanner(System.in);
        // System.out.println("Enter your number");
        // int number = nm.nextInt();
        // if (number >= 0){
        //     System.out.println("Given number are positive");
        // } else if(number < 0){
        //     System.out.println("Given number are negative");
        // }else{
        //     System.out.println("Wrong Input");
        // }

        // Write a Java program to input week number(1-7)and print day of week name using switch case.
        // Scanner week = new Scanner(System.in);
        // System.out.println("Enter a number b/w 1 - 7");
        // int days = week.nextInt();
        // switch (days){
        //     case 1: System.out.println("Monday");
        //             break;
        //     case 2: System.out.println("Tuesday");
        //             break;        
        //     case 3: System.out.println("Wednesday");
        //             break;     
        //     case 4: System.out.println("Thrusday");
        //             break;         
        //     case 5: System.out.println("Friday");
        //             break;      
        //     case 6: System.out.println("Saturday");
        //             break;      
        //     case 7: System.out.println("Sunday");
        //             break;       
        //     default: System.out.println("Wrong Input");              

        // }

        //check a year is leap or not

        // Scanner lp = new Scanner(System.in);
        // System.out.print("Enter your year");
        // int year = lp.nextInt();

        // if(year % 4 == 0 ){
        //         System.out.println(year + " is leap year");
        // } else if(year % 400 == 0 && year % 100 != 0){
        //         System.out.println(year + " is leap year");
        // } else{
        //         System.out.println(year + " is not a leap year");
        // }

        //take input from user and calculate sum of even and odd

        
        // Scanner sc = new Scanner(System.in);

        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // System.out.print(" Enter the number ");
        // number = sc.nextInt();

      // do {  
      //   if(number % 2 == 0){
      //           evenSum += number;
                
      //   } else{
      //           oddSum += number;

      //   }
      //   System.out.print("Do you want to continue? Press 1 for yes or 0 for no"); 
      //   choice=sc.nextInt();
      // } while (choice == 1);
      //   System.out.println("Sum of even numbers are: " + evenSum);
      // System.out.println("Sum of odd numbers are: " + oddSum);

      //Printing table
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter a number: ");
      // int n = sc.nextInt();

      // for(int i=1; i<=10; i++){
      //   System.out.println(n + " * " + i + " = " + n*i);
      // }

      // write a Java method / function to compute the average of three numbers.. 

      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter first number: ");
      // double x = sc.nextDouble();
      
      // System.out.print("Enter second number: ");
      // double y = sc.nextDouble();
      
      // System.out.print("Enter third number: ");
      // double z = sc.nextDouble();

      // System.out.print("The average value is: " + average(x,y,z));

      
     // Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise.
       
      //  Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter a number: ");
      //  int num = sc.nextInt();

      //  //test the isEven method
      //  if(isEven(num)){
      //   System.out.println(num + " is even number");
      //  }else{
      //   System.out.println(num + " is odd number");

      //  }

      //  Write a Java method to compute the sum of the digits in an integer.
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter an integer: ");
      // int digits = sc.nextInt();

      // System.out.println("The sum is " + sumDigit(digits));

       // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
       int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
      //  System.out.println(containsDuplicate(nums));

      //trapping rain water
      int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
      System.out.println(trappedRainWater(height));

      
    }
}

