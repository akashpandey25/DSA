import java.util.*;
public class sumOfDigits_recursion {
    static long sod(long n){
        if(n>=0 && n<=9){
            return n;
        }
        return sod(n/10) + n%10;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(sod(n));
    }
    

}
