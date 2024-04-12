import java.util.*;
public class basic{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("The size is: "+st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println("The size is: "+st.size());
    }
}