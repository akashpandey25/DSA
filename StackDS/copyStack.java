import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack st: "+st);
        //make a stack and add element which will be in reverse order
        Stack<Integer> gt=new Stack<>();
        while (st.size()>0) {
            gt.push(st.pop()); //it will pick element from st and put into gt in reversed order
        }
        System.out.println("Stack gt: "+gt);
        //Now, again  do the same make a new stack and fill it from gt it will copy all the elements.
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println("Stack rt: "+rt);
    }
}
