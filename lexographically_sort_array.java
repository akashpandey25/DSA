//sort the strings array lexographically using selection sort
public class lexographically_sort_array {
    static void sortlexo(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String arr[]={"kiwi", "apple", "papaya", "mango"};
        sortlexo(arr);
        for (String val : arr) {
            System.out.print(val+" ");
            
        }
    }
}
