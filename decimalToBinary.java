import java.util.Scanner;
public class decimalToBinary {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int decimalNUmber=sc.nextInt();
        int ans=0;
        int power=1; //10^0=1
        while(decimalNUmber>0){
            int sol=decimalNUmber%2;
            ans+=(sol*power);
            power*=10;
            decimalNUmber/=2;
        }
        System.out.println(ans);
    }
    
}
