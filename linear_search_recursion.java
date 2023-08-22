public class linear_search_recursion {
    static void findIndices(int a[], int target, int idx){//finding all indices present in array of a number
        if(idx>=a.length){
            return;
        }
        if(a[idx]==target){
            System.out.println(idx);
        }
        findIndices(a, target, idx+1);
    }
    // static int Search(int a[], int target, int idx){ //by finding the index of targated array
    //     if(idx>=a.length) return -1;
    //     if(a[idx]==target) return idx;
    //     return Search(a, target, idx+1);
    // }
    // static boolean linearSearch(int arr[],int n, int target, int idx){ //by checking the taeget is present or not
    //     if(n<=idx){
    //         return false;
    //     }
    //     if(arr[idx]==target)return true;
    //     return linearSearch(arr, n, target, idx+1);

    // }
    public static void main(String[] args) {
        int a[]={1,2,7,2,5};
        int target=2;
        // System.out.println(Search(a, target, 0));
        
        // if(linearSearch(arr, arr.length, target, 0)){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }

        findIndices(a, target, 0);
    }
}
