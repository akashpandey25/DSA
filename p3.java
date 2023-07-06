import java.util.*;
public class p3 {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            char ch=(char)('A'+i-1);
            for(int j=1;j<n;j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
