import java.util.*;

public class pattern4 {
     public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        // for(int i=n;i>=1;i--)
        for(int i=1;i<=n;i++){
            // for(int j=1;j<=k;j++)
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
// *****
// ****
// ***
// **
// *