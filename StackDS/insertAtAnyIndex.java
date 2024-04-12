import java.util.Stack;

public class insertAtAnyIndex {
    public static void main(String[] args) {
          Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack st: "+st);

        //inserting at given index(element)
        int idx=2;
        int x=6;
        Stack<Integer> gt=new Stack<>();
        while(st.size()>idx){ //poping out the element and putting to gt stack for adding in st
            gt.push(st.pop());
        }
        st.push(x); //inserting the element at given index
        System.out.println(gt);
        while(gt.size()>0){ //all the gt elements again filling to st stack after adding the element
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
