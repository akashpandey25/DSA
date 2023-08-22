import java.util.*;
public class gcd_recursion {
    static int igcd(int x , int y){//through iterative
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int GCD(int x,int y){//by euclides algo
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(igcd(x, y));
        System.out.println(GCD(x, y));
        
    }


    
}
