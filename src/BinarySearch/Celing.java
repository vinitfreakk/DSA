package BinarySearch;
//Celing means the smallest element in array which greater than or equal to target element.

/* exmaple the array is arr = [2,3,4,5,9,14,16,18]
    and target = 4;
    step 1:- identify all the elements in the array which is greater than or equal to 4
             so the elements in array which are greater than or equal to 4 are 5,9,14,16,18
    step 2:- and now identify the smallest element in this 5,9,14,16,18 so "5" is my answer

     if target is equal to 9
     the answer is 9

 */
public class Celing {

    public static void main(String[] args) {
        int [] arr = {14,18,20,21,25,26,30,48};
        int target = 43;
        int ans =  celing(arr,target);
        System.out.println(ans);
    }
    static int celing(int [] arr,int target){
        if(target> arr.length-1){
            return -1;
        }
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
        return start;
    }
}
