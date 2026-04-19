import java.util.*;
public class array_2d{

    //finding a key in our matrix
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell: ("+ i + ","+ j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    //FINDING GREATER VALUE AND SMALLEST VALUE
    public static int greater(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                    
                }

                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                    System.out.println("Smallest value is: " + smallest);
                }
            }
        }
        return largest;

    }
    //printing spiral matrix
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //print top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //print right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //print bottom
            for(int j=endCol-1; j>= startCol; j--){
                System.out.print(matrix[endRow][j] + " ");
            }

            //print left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    //calculating diagonal sum
    public static int diagonalSum(int matrix[][]){
        //brute force 
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
                //primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
                //secondary diagonal
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // optimize code
        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if(i != matrix.length-1-i)
                 sum += matrix[i][matrix.length-1-i];
        }

        return sum;
    }

    //search in sorted array (staircase search)
    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } else if(key < matrix[row][col]){
                //left side
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    //practice qn of 2d array
    // 1. count no. of seven in given 2d array
    public static void sevenFound(int matrix1[][]){
        int countof7 = 0;
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                if(matrix1[i][j] == 7){
                    countof7++;
                }
            }
        }
        System.out.println("No. of seven is: " + countof7);
    }

    // 2. sum of second row
    public static void sumOfRow(int matrix2[][]){
        int sum = 0;
        for(int j=0; j<matrix2[0].length; j++){
            sum += matrix2[1][j];
        }
        System.out.println("Sum of second row is: " + sum);
    }

    //3. transpose of a matrix 2X3

    //printing matrix
    public static void printMatrix(int[][]matrix){
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] +" ");
                }
                System.out.println();
                }
    }

        public static void main(String args[]){
        // int matrix[][] = new int [3][3];
        // int n = matrix.length, m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // //for printing
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // // search(matrix, 5);
        // System.out.println("Greatest value is: " + greater(matrix));

        //printing spiral matrix
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        // printSpiral(matrix);       
        // System.out.println(diagonalSum(matrix));  
        int key = 14;
        stairCaseSearch(matrix, key);   

        int matrix1[][] = {
            {4,7,8},
            {8,8,7},
        };   
        
        sevenFound(matrix1);

        int[][]nums= { {1,4,9},{11,4,3},{2,2,3} };
        sumOfRow(nums);

        //transpose of a matrix 2X3
        int[][]matrix3= { {2,3,7}, {5,6,7} };
        int row = 2;
        int col = 3;

        //transpose of a matrix
        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix3[i][j];
            }
        }
        printMatrix(matrix3);
        printMatrix(transpose);
        
    }
}
