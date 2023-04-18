package BinarySearch;
/*   floor means greatest number smaller or equal to target.
complete vise versa of celing

example:-
given arr ={14,18,20,21,25,26,30,48}  and target = 19

then floor of 19 will be 18

another example
given arr ={14,18,20,21,25,26,30,48}  and target = 18

then floor of 18 will be 18


*/
public class Floor {
    public static void main(String[] args) {
        int [] arr = {14,18,20,21,25,26,30,48};
        int target = 15;
        int ans =  floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int [] arr,int target){
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
        return end;
    }
}
