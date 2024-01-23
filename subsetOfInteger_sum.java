import java.util.*;
public class subsetOfInteger_sum {
    static void subsetSum(int k[], int idx, int n, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subsetSum(k, idx+1, n, sum+k[idx]);
        subsetSum(k, idx+1, n, sum);

    }
    public static void main(String[] args) {
        int k[]={2,4,5};
        subsetSum(k, 0, k.length, 0);
        
    }

    
}
