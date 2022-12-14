package selectionsort;

public class SelectionSortClass {

    public static void main(String[] args) {
        int[] array = {6, 7, 3, 2, 1, 0, 9, 5};      
        selectionSort(array);
        printArray(array);          
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min] ){
                    min = j;               
                }
            }                   
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;      
        }
    }

    private static void printArray(int[] array) {
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
}
