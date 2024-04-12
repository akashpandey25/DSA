import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
    public static boolean isBalanced(String st){
        Stack<Character> rt=new Stack<>();
        int n=st.length();
        for(int i=0;i<n;i++){
            char ch=st.charAt(i);
            if(ch=='('){
                rt.push(ch);
            }
            else{
                if(rt.isEmpty()) return false;
                if(rt.peek()=='(') rt.pop();
            }
        }
        if(rt.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
       System.out.println(isBalanced(k));
       sc.close();

    }
}
