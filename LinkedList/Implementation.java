public class Implementation {
    public static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{ 
        Node head=null; //every ll has a head and tail so we defined that
        Node tail=null;
        int size=0;
        //function to Insert at end
        void insertAtEnd(int val){
            Node temp=new Node(val); //creating a new node for the value 'val'
            if(head==null){
                head=temp; //if ll size is 1 then our head will be temp  
            }
            else{
                tail.next=temp; //connecting tail with temp
            }
            tail=temp; //setting tail as temp
            size++;
        }
        // function to Insert at beginning
        void insertAtBeginning(int val){
            Node temp =new Node(val);
            if(head==null){
                insertAtBeginning(val); //setting head & tail as temp
            }
            else{
                temp.next=head; //connecting 1st added value to the next and setting temp as our new head
                head=temp;
            }
            size++;
        }
        //function to insert at given index
        void insetAtGivenIndex(int val, int idx){
            Node t=new Node(val);
            Node temp=head; //it eill help in connectin the added value in LL
            if(idx==size){ //if size is one
                return;
            }
            else if(idx==0){
                insertAtBeginning(val); //because we can perform this operation using insertAtbeginning()
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next; // adding the new to LL
            }
            t.next=temp.next; //connecting the added value with its forward value
            temp.next=t; //with its prev value
            size++;
            
        }
        //function to get an element
        int getElement(int idx){
            if(idx<0 || idx>size){
                System.out.println("Wrong input");
                return -1;
            }
            Node temp=head;
            for( int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data; //it will return the data of the passed index
        } 
        //function to delete an element
        void delete(int idx){
            if(idx==0){ //it will help in making next ele as our head ele
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next; //it will help in deleting the given element
            if(idx==size-1){ //it will help in making 2nd last ele as our tail 
                tail=temp;
                size--;
                return;
            }
            
        }
        void Display(){ //it will display all the values of LL
            Node temp=head; //assigning temp as our head because we won't lost our head value
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
                
            }
            System.out.println();
        }
        // int size(){ //we have initialized size=0 and incrementing in all inserting fun so now we do not need this function
        //     Node temp=head;
        //     int c=0;
        //     while(temp!=null){
        //         c++;
        //         temp=temp.next;
        //     }
        //     return c;
        // }

    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.Display();
        ll.insertAtBeginning(3);
        ll.Display();
        ll.insetAtGivenIndex(9, 2);
        ll.Display();
        // System.out.println(ll.getElement(2));
        ll.delete(4);
        ll.Display();
      
    //    System.out.println(ll.size());
        // System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        
    }
    
}
