package BinarySearch;
//OrderAgnosticBinarySearch means you dont know whether the given array is sorted in acesending or decending order
public class OrderAgnosticBinarySearch extends question1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {56,45,43,42,20,22,12,10,1};
        int target1 = 9;
        int target2 = 43;
       int ans =  OrderAgnosticBinarySearchfun(arr2,target2);
        System.out.println(ans);
    }

    static int OrderAgnosticBinarySearchfun(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = end - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = end - 1;
                }
            }
        }


        return -1;
    }
}
