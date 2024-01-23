import java.util.*;
public class getSubSequence_0fString {
    
    static ArrayList<String> getSSQ (String s){
            ArrayList<String> ans=new ArrayList<>();
            // base case
            if(s.length()==0){// for blank string
                ans.add(" ");
                return ans;
            }
            char curr=s.charAt(0);// self work for substring "a" 
            ArrayList<String> smallAns=getSSQ(s.substring(1));
            for(String ss: smallAns){ 
                ans.add(ss);//works for "bc" string
                ans.add(curr+ss);// adding "a" to "bc" string to get complete set of strings
            }
            return ans;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        System.out.println( getSSQ(k));
        
    }
    
}
