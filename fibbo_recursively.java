
import java.util.*;
public class fibbo_recursively {
    static int fibbo(int n){
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }

       int k=fibbo(n-1)+fibbo(n-2);
       return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibbo(n));
        sc.close();
    }
    
}
