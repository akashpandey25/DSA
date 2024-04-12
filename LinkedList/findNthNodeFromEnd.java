

public class findNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node NthNode(Node head, int val){
        int size=0;
        Node temp=head;
        while(temp!=null){ //for countiing the size of LL
            size++;
            temp=temp.next;
         
        }
        int m=size-val+1; //it is AP formula for calculation of length of target element
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    //optimized way of above function in one traversal
    public static Node NthNode2(Node head, int pos){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=pos;i++){ //fast is first to pos steps
            fast=fast.next;
        }
        while(fast!=null){ //now both moving 1-1 steps in LL
            slow=slow.next; 
            fast=fast.next;
        }
        return slow; //it will return the ans
    }
    public static void main(String[] args) {
         Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        // Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node x=NthNode2(a, 3);
        System.out.println(x.data);
    }
    
}
