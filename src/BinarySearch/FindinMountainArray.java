package BinarySearch;

public class FindinMountainArray {
    public static void main(String[] args) {
         int arr[]= {1,2,1,3,5,6,4};
         int target = 4;
         int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int peakIndexInMoutainArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        //[1,2,1,3,5,6,4]
        return start;
    }

    public static int orderAgnosticBinarySearch(int arr[],int  target,int start,int end){
        Boolean isAsc = arr[start]<arr[end];
        while (start<end){
            int mid = start+(end-start)/2;


            if(isAsc){
                if(arr[mid]<target){
                    start= mid+1;
                }else {
                    end = mid-1;
                }
            }else{
                if(arr[mid]>target){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            if(arr[mid]==target){
                return mid;
            }

        }
        return -1;
    }

    public static int search(int arr[],int target){
        int peak = peakIndexInMoutainArray(arr);
        int fristTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if(fristTry!=-1){
            return fristTry;
        }else {
            return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
        }
    }
}
