public class arrayImplementationOfStack {
   private static class Stack{
        private int arr[]=new int[15];
        private int idx=0;

//function for PUSH an element to stack
    void Push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return; 
        }
        arr[idx]=x;
        idx++;
    }
//function for PEEK element
    int Peek(){
        if(idx==0){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[idx-1];
    }
//function for POP an element
    int Pop(){
        if(idx==0){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
//function for calculating SiZE of stack    
    int Size(){
        return idx;
    }
//function for checking stack is empty or not
    // boolean isEmpty(){
    //     if(idx==0) return true;
    //     else return false;
    // }   
//function for checking stack is full or not
    boolean isFull(){
        if(idx==arr.length) return true;
        else return false;
    }
    
    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   } 
   public static void main(String[] args) {
    Stack st=new Stack();
    st.Push(3);
    st.Push(5);
    st.Push(7);
    st.display();
    System.out.println(st.Peek());
    st.Pop();
    st.display();
    System.out.println(st.Size());
   
   }
}
