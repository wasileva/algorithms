package interpolationsearch;


public class InterpolationSerchClass {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int index = interpolationSearch(array, 9);
         
        if (index != -1){
            System.out.println("Element was found at index " + index);
        } else {
            System.out.println("Element was NOT found");
        }
      
    }

    private static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        
        while (target >= array[low] && target <= array[high] && low <= high){
            int probe = low + (high - low) * (target - array[low])/(array[high] - array[low]);
            System.out.println("probe " + probe);
            
            if (target > array[probe]) low = probe + 1;
            else if (target < array[probe]) high = probe - 1;
            else return probe;
        }
                
        return -1;
    }
    
}
