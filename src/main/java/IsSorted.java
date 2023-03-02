public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int count = 0;
        int start = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > start){
                start = arr[i];
            }else if(arr[i] < start){
                count++;
            }
        }
        if(count != 0){
            return false;
        }else{
            return true;
        }
       
    }
}
