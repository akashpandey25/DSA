import java.util.*;
public class sum_of_series_alternate_signs_recursion {
    static int alternateSum(int n){
        if(n==0)return 0;
        if(n%2==0){
           return alternateSum(n-1)-n;//even
        }
        else{
            return alternateSum(n-1)+n;//odd
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alternateSum(n));
    }
    
}
