package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,8,6,9,10,2,54,21,63,9,9,85,1,2,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int [] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                swap(arr, minIndex, i);
            }
        }

        return arr;
    }
    static int [] swap(int [] arr,int minIndex,int i){
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
        return arr;
    }
}
