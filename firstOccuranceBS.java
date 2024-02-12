//find the first occurance of target in case of repeted value
public class firstOccuranceBS {
    static int firstOccurance(int arr[], int x){
        int st=0, end=arr.length-1;
        int fo=-1;  //
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                fo=mid;  //picking the occurance and updating fo
                end=mid-1;  //checking with prevous values
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 2, 5, 5, 5, 6, 7};
        int ans=firstOccurance(arr, 5);
        System.out.println(ans);
    }
    
}
