package insertionsort;

public class InsertionClass {

    public static void main(String[] args) {
        int[] array = {7, 8, 1, 2, 4, 5, 8, 0, 3};
        
        insertionSort(array);
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;   
        }
    }   
}
