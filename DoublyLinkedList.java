public class DoublyLinkedList {
Node start;

class Node
{
    int data;
    Node next;
    Node prev;
}
void insertEnd(int value)
{
    if(start==null)
    {
        Node newNode=new Node();
        newNode.data=value;
        newNode.next=newNode.prev=newNode;
        start=newNode;
        return;
    }
    Node last=(start).prev;
    Node newNode=new Node();
    newNode.data=value;
    newNode.next=start;
    (start).prev=newNode;
    newNode.prev=last;
    last.next=newNode;
}
 void insertBeg(int value)
{
    Node last = (start).prev;
    Node newNode = new Node();
    newNode.data=value;
    newNode.next=start;
    newNode.prev=last;

    last.next = (start).prev = newNode;

    start=newNode;
}
void insertAfter(int value1,int value2)
{
    Node newNode=new Node();
    newNode.data=value1;
    Node temp=start;

    while (temp.data!=value2)
        temp=temp.next;
    Node next=temp.next;


    temp.next=newNode;
    newNode.prev=temp;
    newNode.next=next;
    next.prev=newNode;
}
void display()
{
    Node temp=start;
    System.out.println("\nTraversal in forward direction\n");
    while (temp.next!=start)
    {
        System.out.printf("%d", temp.data);
        temp=temp.next;
    }
    System.out.printf("%d",temp.data);

    System.out.println("\nTraversal in reverse direction \n");
    Node last=start.prev;
    temp=last;
    while(temp.prev!=last)
    {
        System.out.printf("%d",temp.data);
        temp=temp.prev;
    }
    System.out.printf("%d",temp.data);
}
public static void main(String []args)
{
    DoublyLinkedList dcl=new DoublyLinkedList();
    Node start=null;
    dcl.insertBeg(10);
    dcl.insertBeg(20);
    dcl.insertAfter(1,30);
    dcl.insertEnd(40);
    dcl.display();



}
}
