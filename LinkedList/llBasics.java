public class llBasics{
    public static class Node{
         int data;
         Node next; //Node is like a dataType
         Node(int data){//Constructer of this class
            this.data=data;
         }
    }
   public static void main(String[] args) {
    //creating the object for class Node
    Node x=new Node(5); // the data are not connected with each other( 5 4 3 7 10)
    Node y=new Node(4);
    Node z=new Node(3);
    Node a=new Node(7);
    Node b=new Node(10);
    x.next=y; //it is connecting the current value with the next
    y.next=z;
    z.next=a;
    a.next=b; // now all are connected (5->4->3->7->10)
    System.out.println(z.data); //will return  the data of current value
    System.out.println(z.next.data); //will return the data of next node
    System.out.println(z.next); //will return the memory address of next node
    //Dosplaying the list
    //when the range is known we can use for loop
   // Node temp=x;
    // for(int i=1;i<=5;i++){
    //     System.out.println(temp.data+" ");
    //     temp=temp.next;
    // }
    //when the range is not known use while loop
    Node temp=x;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    
   }

}