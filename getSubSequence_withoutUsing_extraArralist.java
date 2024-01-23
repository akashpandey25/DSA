import java.util.*;
public class getSubSequence_withoutUsing_extraArralist {

    static void printSSQ(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remStr=s.substring(1);
        printSSQ(remStr, currAns+curr);
        printSSQ(remStr, currAns);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        printSSQ(k, "");
       
        
    }
    
}
