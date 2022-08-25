package bubblesort;

public class BubbleSortClass {

    public static void main(String[] args) {
        int[] array = {9,5,1,3,4,0,2};
        bubbleSort(array);
        for (int i : array){
            System.out.print( i +  " ");     
        }
        System.out.println("");
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
            }
            }
        }
    }
    
}
