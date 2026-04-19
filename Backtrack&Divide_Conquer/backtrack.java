public class backtrack{
    //Backtracking in array
        public static void changeArr(int arr[], int i, int val){
            //base case
            if(i == arr.length){
                printArr(arr);
                return;
            }

            //recursion
            arr[i] = val;
            changeArr(arr, i+1, val+1);
            arr[i] = arr[i] - 2; //backtracking
        }
        //for printing array
        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        //finding subset of a string
        public static void findSubset(String str, String ans, int i){
            //base case
            if(i == str.length()){
                System.out.println(ans);
                return;
            }
            //recursion
            // if yes choice
            findSubset(str, ans+str.charAt(i), i+1);

            // if no choice
            findSubset(str, ans, i+1);
        }

        // finding permutation of a string
        public static void findPermutation(String str, String ans){
            //base case
            if(str.length() == 0){
                System.out.println(ans);
                return;
            }

            //kam
            for(int i=0; i<str.length(); i++){
              char curr = str.charAt(i);
            //  "abcde" => "ab" + "de" = "abde"
              String newStr = str.substring(0, i) + str.substring(i+1);
              findPermutation(newStr, ans+curr);

            }
        }

        //N-Queen problem 4X4 matrix
        // 1. check safe position through this fn
        public static boolean isSafe(char board[][], int row, int col){
            // vertical up
            for(int i=row-1; i>=0; i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }

            //diagonal left up
            for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }

            // diagonal up right
            for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++ ){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }
            return true;
        }

        // 2. N-queen fn
        public static void nQueen(char board[][], int row){
            //base case
            if(row == board.length){
                printBoard(board);
                return;
            }

            //column loop
            for(int j=0; j<board.length; j++){
                if(isSafe(board, row, j)){
                    board[row][j] = 'Q';
                    nQueen(board, row+1); //function call
                    board[row][j] = 'x'; //backtrack
                }
            }
        }

        // 3. for printing board
        public static void printBoard(char board[][]){
            System.out.println("----------- chess board ------------");
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    System.out.print(board[i][j] + " ");
                }
            System.out.println();

            }
        }

        //Grid ways problem 
        public static int gridWays(int i, int j, int n, int m){
            //base case
            if(i == n-1 && j == m-1){
                return 1; 
            }else if(i == n || j == m){
                return 0; //border cross cond
            }

            int w1 = gridWays(i+1, j, n, m);
            int w2 = gridWays(i, j+1, n, m);

            return w1 + w2;
        }

        //Suduko problem
        //1. check if digit exists
        public static boolean isSafe(int sudoku[][], int row, int col, int digit){
            //column
            for(int i=0; i<=8; i++){
                if(sudoku[i][col] == digit){
                    return false;
                }
            }

            //row
            for(int j=0; j<=8; j++){
                if(sudoku[row][j] == digit){
                    return false;
                }
            }

            //grid
            int sr = (row/3) * 3;
            int sc = (col/3) * 3;

            for(int i=sr; i<sr+3; i++){
                for(int j=sc; j<sc+3; j++){
                    if(sudoku[i][j] == digit){
                        return false;
                    }
                }
            }
            return true;
        }

        //2. Sudoku fn
        public static boolean sudokuSolver(int sudoku[][], int row, int col){
            //base case
            if(row == 9){
                return true;
            }


            int nextRow = row, nextCol = col + 1;
            if(col + 1 == 9){
                nextRow = row + 1;
                nextCol = 0;
            }
            if(sudoku[row][col] != 0){
                return sudokuSolver(sudoku, nextRow, nextCol);
            }

            for(int digit=1; digit<=9; digit++){
                    if(isSafe(sudoku, row, col, digit)){
                        sudoku[row][col] = digit;
                        if(sudokuSolver(sudoku, nextRow, nextCol)){ //soln exists
                            return true;
                        }
                        sudoku[row][col] = 0;
                    }
            }
            return false;
        }

        // 3.print sudoku
        public static void printSudoku(int sudoku[][]){
            for(int i=0; i<sudoku.length; i++){
                for(int j=0; j<sudoku.length; j++){
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        }


    public static void main(String args[]){
        int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        //find subset
        String str = "abc";
        // findSubset(str, "", 0);

        //find permutation
        String str1 = "abc";
        // findPermutation(str1, "");

        //n-queen problem
        int n = 4;
        char board[][] = new char [n][n];

        //initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        // nQueen(board, 0);

        //Grid ways
        // System.out.println(gridWays(0,0,3,3));

        //Sudoko problem
        int sudoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution not exists");

        }

    }
}