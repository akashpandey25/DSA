/*
 * given a rotated sorted array of integers which contains dinstict element and integer Target, return the 
 * index of target if it is in the array otherwise return -1.
 * input [3 4 5 1 2] target=4, output{1}
 */
public class BsInRotatedArray2 {
    static int BsSearchTarget(int arr[], int target){
        int st=0, end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<arr[end]){  //if mid to end is sorted
                if(target>arr[mid] && target<=arr[end]){ //if our ans is in b/w mid to end sorted array
                    st=mid+1; //our search will start from mid+1
                }
                else{
                    end=mid-1;
                }
            }else{//if start to mid is sorted
                if(target<arr[mid] && target>=arr[st]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(BsSearchTarget(arr, 2));
    }
}
