package quicksort;

public class QuickSortClass {

    public static void main(String[] args) {
        int[] array = {8, 2, 4, 7, 1, 3, 9, 6, 5}; 
        
        quickSort(array, 0, array.length-1);       
        printArray(array);       
    }  

    private static void quickSort(int[] array, int start, int end) {  
        if (start < end){  
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {      
        int pivot = array[end];
        int i = start - 1;      
        for (int j = start; j < end; j++){
            if (array[j] < pivot){
                i++;
                swap(array,i,j);
            }
        }
        i++;
        swap(array, i, end);  
        return i;
    }
    
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
