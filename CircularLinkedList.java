

public class CircularLinkedList {

Node head=null;
Node tail=null;
int length=0;




   public static class Node
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    void insertEle(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;    // tail point to head it is circularlist

        }
        length++;
    }
//
//    void insertNodeAtBeg(int data)
//    {
//       Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//
//    }

    void insertAtMid(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else
        {
            Node temp,current;
            int count=(length %2==0)?(length /2):((length+1)/2);
            temp=head;
            current=null;
            for(int i=0;i< count;i++)
            {
                current = temp;
                temp = temp.next;
            }

                current.next = newNode;
                newNode.next = temp;

        }
         length++;

    }
    void display1()
    {
            Node current=head;
            if(head==null)
            {
                System.out.println("List is empty");
            }
            else
            {
                do{
                    System.out.println(""+current.data);
                    current=current.next;
                }
                while (current!=head);
                System.out.println();
            }
    }

//    void display() {
//   Node current=head;
//   if(head==null)
//   {
//       System.out.println("List is empty");
//   }
//   else
//   {
//       System.out.println("Nodes of the circular linked list:");
//       do {
//           System.out.println(""+current.data);
//           current=current.next;
//       }
//       while(current!=head);
//       System.out.println();
  // }



//   }
//======================================================================================================================

    public static void main(String []args)
    {
        CircularLinkedList cl=new CircularLinkedList();
//        cl.insertNodeAtBeg(10);
//        cl.insertNodeAtBeg(20);
//        cl.insertNodeAtBeg(30);
//        cl.insertNodeAtBeg(40);
        //cl.PrintList();
        cl.insertEle(50);
        cl.insertEle(60);
        cl.insertEle(70);
        cl.insertAtMid(40);
        //cl.display();
      cl.display1();
    }

    }
