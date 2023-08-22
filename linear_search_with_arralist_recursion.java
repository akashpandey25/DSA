import java.util.*;
public class linear_search_with_arralist_recursion {
    static ArrayList<Integer> linearSearch(int a[],int target, int idx){
        if(idx>=a.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> l1=new ArrayList<>();
        if(a[idx]==target){
            l1.add(idx);
        }
        ArrayList<Integer> k1=linearSearch(a, target, idx+1);
        l1.addAll(k1);
        return l1;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,2,6};
        int target=2;
        System.out.println(linearSearch(a, target, 0));
        
    }
    
}
