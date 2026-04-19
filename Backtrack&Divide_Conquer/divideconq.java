public class divideconq{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Merge sort
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        //kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei){
            int temp[] = new int[ei-si+1];
            int i = si; //idx for 1st sorted part
            int j = mid+1; //idx for 2nd sorted part
            int k = 0; //idx for temp

            while(i <= mid && j <= ei){
                if(arr[i] < arr[j]){
                    temp[k] = arr[i];
                    i++;
                }else{
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }

            //for leftover element of 1st sorted part
            while(i <= mid){
                temp[k++] = arr[i++];
            }
            //for leftover element of 2st sorted part
            while(j <= ei){
                temp[k++] = arr[j++];
            }

            //copy temp to original array
            for(k=0, i=si; k<temp.length; k++, i++){
                arr[i] = temp[k];
            }

    }

    //Quick sort
    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei); //right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];

        int i = si - 1; //to make place for element smaller than pivot
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //last for exchange pivot
                i++;
                //swap
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }

    //Sorted and rotated array search like binary search
    public static int search(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //kam
        int mid = si + (ei - si)/2;

        if(arr[mid] == target){
            return mid;
        }
        //mid on Line 1
        if(arr[si] <= arr[mid]){
            //case 1: Left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                //right side
                return search(arr, target, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case c: right
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                //case d: left
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String args[]){
        // int arr [] = {6,3,9,2,5,8};
        // // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);

        int arr[] = {2,4,5,0,9,8,6};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);

    }
}