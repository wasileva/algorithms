package binary;


public class BinarySearchClass {

    public static void main(String[] args) {
       int[] array = new int [1000000];
            
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
        int index = binarySearch(array, 78);
        if (index != -1){
            System.out.println("Element was found at index " + index);
        } else {
            System.out.println("Element was NOT found");
        }
    }

    private static int binarySearch(int[] array, int searchValue) {
        int low = 0;
        int high = array.length - 1;
        int middleIndex = 0;
        int middleValue = 0;
        
        while(low <= high){
            middleIndex = low + (high - low)/2;
            middleValue = array[middleIndex];
            if(searchValue < middleValue ) high = middleValue - 1;
            else if (searchValue > middleValue) low = middleValue + 1;
            else return middleIndex;
        }
        return -1;
    }    
}
