
package ds_algo;

/**
 *
 * @author SCION
 * implementing a singly linked list with all the imp. methods.
 */
 class node{
    int data; 
    node next;//contains the address of the next node. 
}
public class LinkedList {
    node head;//head points to the first element of the linked list.
    
    public void insert(int data){
        
        node temp=new node();
        temp.data=data;
        
        if(head==null){
            head=temp;//this is when we dont have any element in the linked list.
        }
        else{
            node n1=head;//if there are already some nodes present in the list then we have to  add 
//            the node at the end of the list and we have to traverse the node starting from beginning.
            while(n1.next!=null){
                n1=n1.next;//here we are traversing the linked list to check which node has next as null.
            }
            n1.next=temp;//here  we insert the node at the end of the list.
        }
    }
    public void show(){
        node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;//while printing we have to shift to the next node to print the next value,n.next helps us to traverse.
        }
        System.out.println(temp.data);//this helps us to  display the last node as in above loop we are printing 
//till we receive the next value as null and since the last node has null value so we have to print it seperately.
    }
    public void insertAtStart(int data){
        node temp=new node();
        temp.data=data;
        temp.next=head;//here we point the next of the new node to the earlier first node 
//        as it was the head before.
head=temp;
//now we make this node as the head node.
    }
    public void insertAt(int index,int data){
        node temp=new node();
        temp.data=data;
        if(index==0){
            insertAtStart(data);//this is a case when we are adding data at the first index.
//            we should just use the atstart method and not the code below.
        }
        else{
        node n1=head;//traversing begins from head node.
        for(int i=0;i<index-1;i++){
            n1=n1.next;//this code helps to reach the desired index .
        }
        temp.next=n1.next;//here we give new node the address to which the prev node was pointing to.
        n1.next=temp;//the prev node now points to the new node.
//        its like the new node was inserted bw the twi nodes ,so the left node points to the middle node and
//the the middle node points to the right node.
    }
    }
      int getSize(){
        int size=0;
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        return size;
        
    }
    public void deleteAt(int index){
        if(head==null){
            System.out.println("can't delete from an empty list");
        }
       else if(index==0){
            head=head.next;//if we are deleting first node then we just want the
//            head to point to the next node.
        }
        else
        {
            node temp=new node();
            temp=head;//for traversal of list.
            node n1=null;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            n1=temp.next;
            temp.next=n1.next;//here we give the address of the node to which the deleted node was pointing to ,
//            to the prev node of the deleted node,so that now te the prev node now points
//to the node ahead of the deleted node.
            System.out.println("the deleted data is:-"+n1.data);
            
        }
   
    }
    
    public static void main(String[] args) {
       LinkedList list=new LinkedList();
      list.insert(5);
      list.insert(18);
      list.insert(45);
      list.insertAtStart(20);
     list.insertAt(0,55);
     list.deleteAt(1);

     list.show();
          int size=list.getSize();
 
             System.out.println("size is "+size);

    }
}
