//  input ---[0 5 0 3 42] move all zeros at the end without moving the non-zeros
// output---[5 2 42 0 0]
public class Move_zero_non_zero {
       
    public static void main(String[] args) {
        int arr[]={0, 5, 0, 3, 42};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){ //it is checking that the current value is zero or not and also next value for swapping
                    int temp=arr[j];        //if current value is 0 and next is non-zero then swap
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
