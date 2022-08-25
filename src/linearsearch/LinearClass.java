package linearsearch;

public class LinearClass {

     public static void main(String[] args) {
        
         int[] array = {8, 6, 5, 4, 3, 5, 7, 1, 2, 0, 9};
         
         int index = linearSearch(array, 7);
         
         if (index!=-1){
             System.out.println("Element found at index " + index);
         }
         else {
             System.out.println("Element not found");
         }
         
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                return i;
            }           
        }
        return -1;
    }
    
}
