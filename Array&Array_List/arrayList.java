// import java.util.ArrayList;
import java.util.*;
public class arrayList{
    //Swap fn
    public static void swap(ArrayList<Integer> list1, int idx1, int idx2){
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }

    //container with most water fn
    public static int mostWater(ArrayList<Integer> height){
        int maxWater = 0;
        //brute force approach
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    //pair sum -1 
    //Brute force approach
    // public static boolean pairSum(ArrayList<Integer> pairSum, int target){
    //     for(int i=0; i<pairSum.size(); i++){
    //         for(int j=i+1; j<pairSum.size(); j++){
    //             if(pairSum.get(i) + pairSum.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // pair sum 1 using 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> pairSum, int target){
        int lp = 0;
        int rp = pairSum.size()-1;

        while(lp != rp){
            //case 1
            if(pairSum.get(lp) + pairSum.get(rp) == target){
                return true;
            }

            //case 2
            if(pairSum.get(lp) + pairSum.get(rp) < target){
                lp++;
            } else{
                 //case 3
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //Add element - 0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2,7);

        // System.out.println(list);

        // Get element
        int element = list.get(2);
        // System.out.println(element);

        // Remove element
        list.remove(3);
        // System.out.println(list);

        //Set element at index
        list.set(1,5);
        // System.out.println(list);

        // Size of arrayList
        // System.out.println(list.size());

        //print array list using loop
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(4);
        list1.add(8);

        // for(int i=list1.size()-1; i>=0; i--){
        //     System.out.print(list1.get(i) + " ");
        // }
        // System.out.println();

        //Find maximum in arrayList
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list1.size(); i++){
            // if(max < list1.get(i)){
            //     max = list1.get(i);
            // }
            max = Math.max(max, list1.get(i));
        }
        // System.out.println("Max value is: " + max);


        //Swap two numbers
        int idx1 = 1;
        int idx2 = 3;

        // System.out.println(list1);
        // swap(list1, idx1, idx2);
        // System.out.println(list1);

        //Sorting an ArrayList
        // System.out.println(list1);
        //asc
        Collections.sort(list1);
        // System.out.println(list1);

        //desc
        Collections.sort(list1, Collections.reverseOrder());
        // System.out.println(list1);


        //Multidimensional ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // ArrayList<Integer> list4 = new ArrayList<>();

        // for(int i=1; i<=5; i++){
        //     list2.add(i*1); //1,2,3,4,5
        //     list3.add(i*2); //2,4,6,8,10
        //     list4.add(i*3);

        // }
        // mainList.add(list2);
        // mainList.add(list3);
        // mainList.add(list4);

        // System.out.println(mainList);

        // //nested loop for printing
        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        //Container with most water Brute force
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostWater(height));


        //pair Sum 
        ArrayList<Integer> pairSum = new ArrayList<>();
        pairSum.add(1);
        pairSum.add(2);
        pairSum.add(3);
        pairSum.add(4);
        pairSum.add(5);

        int target = 50;
        System.out.println(pairSum1(pairSum, target));



    }
}