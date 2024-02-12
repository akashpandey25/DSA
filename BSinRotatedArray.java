//Searcing the min element in rotated sorted array inout[3 4 5 1 2] output{mi}
public class BSinRotatedArray {
    static int BsRotated(int arr[]){
        int n=arr.length;
        int st=0, end=n-1;
        int ans=-1; //to storing the index of min element
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=arr[n-1]){ //we are checking that if ans is in first half or not
                ans=mid;  //setting the current index as our answer 
                end=mid-1;
            }
            else if(arr[mid]>arr[n-1]){  // we are checking that if mid is greater than end element then we need to search in 2nd half
                st=mid+1;
            }
           
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 5, 6, 7, 1, 2};
        System.out.println(BsRotated(arr));
    }
    
}
