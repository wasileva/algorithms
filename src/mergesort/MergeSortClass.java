package mergesort;

public class MergeSortClass {

    public static void main(String[] args) {
      //  int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        int[] array = {3, 7, 8, 5, 4, 2, 6, 1};
        
        mergeSort(array);
        
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void mergeSort(int[] array){       
        int length = array.length;
        if (length > 1) { //base case       
            int middle = length/2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[length - middle];

            int i = 0; //left array 
            int j = 0; //right array

            for (; i < length; i++){
                if (i < middle){
                    leftArray[i] = array[i];
                } 
                else {
                    rightArray[j] = array[i];
                    j++;
                }
            }    
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array);
        }
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
 
        int i = 0,  l = 0, r = 0;  // indices
        
        // check condition for merging
        while (l < leftArray.length && r < rightArray.length){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                l++;
                i++;
            }
            else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }
      
        while (l < leftArray.length){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        
        while (r < rightArray.length){
            array[i] = rightArray[r];
            r++;
            i++;
            }
        }
       
    }
   

