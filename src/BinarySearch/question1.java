package BinarySearch;
//Binarysearch only works in sorted array
public class question1{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
// we are usiing static int binary search because we are calling this function in main function
    static int binarySearch(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
