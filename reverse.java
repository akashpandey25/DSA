import java.util.*;
public class reverse {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            ans=ans*10+(n%10);
            n=n/10;

        }
        System.out.println(ans);

    }

    

    
}
