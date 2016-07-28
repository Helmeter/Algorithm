/**
 * Created by helmeter on 6/25/16.
 */
public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return ;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=arr.length-1; j>i; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] test = {5,3,8,6,4};
        bubbleSort(test);
        for(int j:test){
        System.out.print(j);}

    }
}
