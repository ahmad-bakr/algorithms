package search;

/**
 * Binary search implementation
 * @author ahmad.bakr
 *
 */
public class BinarySearch {

    /**
     * Find if the target element can be located in the array (note the array must be SORTED)
     * @param array array array
     * @param target target element
     * @return the index of the element or -1
     * @throws Exception Exception
     */
    public static int find(int [] array, int target, boolean recMethod) throws Exception{
        if(array == null) throw new Exception("Array can not be null");
        if(recMethod){
            return binarySearchRec(array, target, 0, array.length-1);
        }else{
            return binarySearchIterative(array, target);
        }
    }
    
    
    /**
     * Recursive binary Search
     * @param array  array
     * @param target target number
     * @param start start of the array
     * @param end end of the array
     * @return the index of the target element if found, otherwise null
     */
    private static int binarySearchRec(int [] array, int target, int start, int end){
        if(start > end ) return -1;
        int middle = start + ((end-start)/2);
        if(array[middle] == target) return middle;
        if(array[middle] > target){
            return binarySearchRec(array, target, start, middle -1);
        }else{
            return binarySearchRec(array, target, middle + 1, end);
        }
    }

    /**
     * Iterative binary search
     * @param array array
     * @param target target 
     * @return the index of the target element if found, otherwise null
     */
    private static int binarySearchIterative(int [] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int middle = start + ((end-start)/2);
            if(array[middle] == target) return middle;
            if(array[middle] > target){
                end = middle -1;
            }else{
                start = middle +1;
            }
        }
        return -1;
    }
    
    
    
    public static void main(String[] args) throws Exception {
        int [] array = {1,2,3,4,5,6,7,8};
        System.out.println(find(array, 2, false));
    }
}
