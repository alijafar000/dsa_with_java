import java.util.*;
public class sorting{
    //bubble sort
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    //selection sort
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insert
            arr[prev+1] = curr;
        }
    }

    //counting sort
    public static void countingSort(int arr[]) {
    // find maximum value
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    //create count array
    int count[] = new int[max + 1];

    //store frequency
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    //rebuild sorted array
    int index = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[index] = i;
            index++;
            count[i]--;
        }
    }
}
    //for printing arr
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //practice question of sorting

    //bubble sort in decreasing order
    public static void bubbleSortDec(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    //selection sort in decreasing order

    public static void selectionSortDec(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //selection sort in decreasing order
    public static void insertionSortDec(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insert
            arr[prev+1] = curr;
        }
    }


    public static void main(String args[]){
        // int arr[] = {5,4,1,3,2};
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // countingSort(arr);

        //practice
        // bubbleSortDec(arr);
        // selectionSortDec(arr);
        insertionSortDec(arr);

        //inbuilt sort
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr, Collections.reverseOrder()); //thats work on object not int it work on Integer datatype.
        printArr(arr);
    }
}