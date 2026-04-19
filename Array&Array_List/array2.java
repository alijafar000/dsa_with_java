public class array2{

    //function for print subarrays
    // public static void printSubArray(int numbers[]){
    //     //outer loop
    //     for(int i=0; i<numbers.length; i++){
    //         //start
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             for(int k=start; k<=end; k++){ //for printing
    //                 System.out.print(numbers[k] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    //function for print sum of max subarray
    // public static void maxSubArray(int numbers[]){
    //     //define two variable
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     //outer loop
    //     for(int i=0; i<numbers.length; i++){
    //         //start
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currSum = 0; //for reset the curr sum Important!
    //                         // Reset before calculating each subarray.
    //             for(int k=start; k<=end; k++){ //for printing
    //                 //subarray sum
    //                 currSum += numbers[k];
                    
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
            
    //     }
    //     System.out.println("Max sum is: " + maxSum);
    // }

    //function for kadanes algo 
    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;

    //     for(int i=0; i<numbers.length; i++){
    //         cs = cs + numbers[i];
    //         if(cs < 0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println("Our max sum is: " + ms);
    // }

    //function for trapping rainwater
    // public static int trappedRainWater(int height[]){
    //     int n = height.length;

    //     //creating auxilary array/helper array
    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];

    //     //calculate left max boundary - array
    //     for(int i=1; i<n; i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }
    //     //creating auxilary array/helper array
    //     int rightMax[] = new int[n];
    //     rightMax[n-1] = height[n-1];


    //     //calculate right max boundary - array
    //     for(int i=n-2; i>=0; i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }
    //     int trappedWater = 0;

    //     //loop
    //     for(int i=0; i<n; i++){
    //         //calculating waterlevel
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);

    //         //calculating trapWater
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return trappedWater;
    // }

    // function for calculating buy and sell stock
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE; //+infinity
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //today profit
                maxProfit = Math.max(maxProfit, profit);

            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10,12};
        // printSubArray(numbers);

        int number[] = {10, 20, 30, 40, 50};
        // maxSubArray(number);

        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadanes(num);

        int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedRainWater(height));

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStock(prices));

    }
}