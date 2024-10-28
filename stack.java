import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack stack=new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.peek();
		stack.display();
		
	}
}
class Stack
{
    private int[] StackArray;
    private int top;
    private int capacity;
    public  Stack(int size)
    {
        StackArray=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int value)
    {
        if(isfull())
        {
            
            System.out.print("This Stack is full so unable add"+value);
            return;
        }
        StackArray[++top]=value;
    }
    public  boolean isfull()
       {
           return top==capacity-1;
       }
    public  boolean isEmpty()
       {
           return top==-1;
       }
       
       public int pop()
       {
           return StackArray [top--];
       }
       public void peek()
       {
           System.out.print(StackArray[top]);
       }
    public void display()
    {
        if (isEmpty())
        {
            System.out.print("is empty");
        }
        System.out.print("Your Stack is:");
        for (int i=0;i<=top ;i++ )
        {
            System.out.print(StackArray[i]+" ");
        }
    }
       
}
