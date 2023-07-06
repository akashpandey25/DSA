import java.util.*;
public class prac_bitwise {
    public static void main(String a[]){
        // int p=9;
        // int b=10;
        // System.out.println(p|b);
        // System.out.println(p<<1);
        // System.out.println(p>>2);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            c=c+(n%10);
            n=n/10;
            // c++
        }
        System.out.println(c);
        sc.close();

    }    
}
