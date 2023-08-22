public class sum_of_element_recursion {
    static int sumOfElement(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return sumOfElement(arr, idx+1)+ arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        System.out.println(sumOfElement(arr, 0));
    }
    
}
