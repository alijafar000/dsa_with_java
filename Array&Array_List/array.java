import java.util.*;
public class array{

    //array as a function arguments
    // public static void updateArray(int mark[]){
    //     for(int i=0; i<mark.length; i++){
    //         mark[i] = mark[i] + 1;
    //     }
    // }

    //linear search
    // public static int linearSearch(int score[], int key){
    //     for(int i=0; i<score.length; i++){
    //         if (score[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //find largest element
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; //-infinity
    //     int smallest = Integer.MAX_VALUE; //+infinity
    //     for(int i=0; i<numbers.length; i++){
    //             if(largest < numbers[i]){
    //              largest = numbers[i];
    //     }
    //     if(smallest > numbers[i]){
    //         smallest = numbers[i];
    //     }
    //     }
    //     System.out.println("Smallest value is: " + smallest);
    //     return largest;
    // }

    //function for binary search
    // public static int binarySearch(int number[], int key){
    //     int start = 0;
    //     int end = number.length-1;

    //     while(start<=end){
    //         int mid = (start + end) / 2;

    //         //compare mid and key
    //         if(number[mid] == key){
    //             return mid;
    //         }
    //         if(number[mid] < key){ //right side
    //             start = mid + 1;
    //         } else{ //left side
    //             end = mid - 1;
    //         }
    //     }
    //     return -1; //if key is not found
    // }

    //function for reverse of an array
    // public static void reverse(int numbers[]){
    //     int first = 0, last = numbers.length-1;

    //     while(first < last){
    //         //swap
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--; 

    //     }
    // }
    
    public static void main(String args[]){
        // String jafar[] = {"Jafar", "Nasir", "Noor Alam"};
        // System.out.print(jafar);

        //array creation
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Physics number: ");
        // marks[0] = sc.nextInt();
        // System.out.print("Enter Chemistry number: ");
        // marks[1] = sc.nextInt();
        // System.out.print("Enter Math number: ");
        // marks[2] = sc.nextInt();

        // System.out.println("Pyhsics marks is: " + marks[0]);
        // System.out.println("Chemistry marks is: " + marks[1]);
        // System.out.println("Math marks is: " + marks[2]);

        // //update array
        // marks[2] = marks[2] + 2;
        // System.out.println("Updated math marks is: " + marks[2]);

        // //calculating average of marks
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Average marks is: " + percentage + "%");

        //array as a function arguments

        // int mark[] = {90, 92, 94};
        // updateArray(mark);

        // //printing values
        // for(int i=0; i<mark.length; i++){
        //     System.out.print(mark[i] + " ");
        // }
        // System.out.println();

        //linear search with function
        // int score[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;

        // int index = linearSearch(score, key);
        // if(index == -1){
        //     System.out.println("Not found!");
        // }else{
        //     System.out.println("key found at index: " + index);
        // }

        //find largest element
        // int numbers[] = {1, 2, 4, 8, 10, 12};
        // System.out.println("Largest number is: " + getLargest(numbers));

        //binary searching
        // int number[] = {12, 34, 45, 56, 66, 70, 87, 90};
        // int key = 626;
        // System.out.println("Key found at index: " + binarySearch(number, key));

        //reverse of an array
        // int numbers[] = {10, 15, 20, 25, 30, 35, 40};
        // reverse(numbers);
        // //for printing array
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

    }
}