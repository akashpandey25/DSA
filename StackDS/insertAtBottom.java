import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack st: "+st);
        
        //to insert at bottom reverse the stack and add the element 
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        gt.push(0); //adding element to bottom of stack
        System.out.println("Stack gt: "+gt);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println("Stack st: "+st);
    }
    
}
