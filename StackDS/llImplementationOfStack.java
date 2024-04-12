public class llImplementationOfStack {
    public static class  Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        } 
    }
    public static class Stack{
        Node head=null;
        int size=0;

        //function for Push in stack
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        //function for Pop
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }
        void displayrev(Node head){
            if(head==null) return;
            displayrev(head.next);
            System.out.print(head.val+" ");
        }
        
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.displayrev(st.head);
        System.out.println();
        st.pop();
        st.displayrev(st.head);
        System.out.println();
        System.out.println(st.pop());
        st.displayrev(st.head);
        System.out.println();
        System.out.println(st.peek());
        
    }
}
