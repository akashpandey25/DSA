public class max_in_array_recursion {
    static int maxInArray(int arr[], int idx){
        if(idx==arr.length-1){//base case
            return arr[idx];
        }
        int k=maxInArray(arr, idx+1);//recursive work
        return Math.max(arr[idx], k);//self work

    }
    public static void main(String[] args) {
        int arr[]={1,5,67,8,80,0,63,122, };
        System.out.println(maxInArray(arr, 0));
    }
}
