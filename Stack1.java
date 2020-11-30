//Java progrm to implement basic stack operations.

class Stack
{
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX];
    
    boolean isEmpty()
    {
        return(top < 0);
    }
    
    Stack()
    {
        top = -1;
    }
    
    boolean push(int x)
    {
        if(top >= MAX)
        {
            System.out.println("Stack is Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            System.out.println(x + "pushed into Stack");
            return true;
        }
    }
int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack is Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            System.out.println(x + "pushed into Stack");
            return x;
        }
    }
    int peek()
    {
         if(top < 0)
        {
            System.out.println("Stack is Underflow");
            return 0;
        }
        else
        {
            int x = a[top];
            return x;
        }
    }
}
class Stack1
{
   public static void main(String[] args)
   {
       Stack s = new Stack();
       s.push(10);
       s.push(20);
       s.push(30);
       System.out.println(s.pop() + "Popped from Stack");
       
   } 
}