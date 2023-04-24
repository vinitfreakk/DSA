package BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int [] vinit = {6,5,4,8,9,2};
        System.out.println(Arrays.toString(bubblesort(vinit)));
    }
    public static int [] bubblesort(int [] arr){
        Boolean swaped;
        for(int i =0;i< arr.length;i++){
            swaped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }
            }
            if(!swaped){
                return arr;
            }
        }

         return arr;
    }
}
