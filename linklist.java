import java.util.*;
public class  Main{
    public static void main(String[] args)
    {
        SinglyLinkList list=new SinglyLinkList();
        list.inserAtEnt(1);
        list.inserAtEnt(2);
        list.inserAtEnt(3);
        list.inserAtEnt(4);
        list.inserAtEnt(5);
        list.inserAtEnt(6);
        list.inserAtBegging(0);
        list.delete();
        list.printlist();
        
        
    }
}
class Node{
    int data;
    Node next;
    public  Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SinglyLinkList
{
    private Node head;
    public SinglyLinkList()
    {
        head=null;
    }
    public void inserAtEnt(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node Current=head;
        while(Current.next!=null)
        {
            Current=Current.next;
        }
        Current.next=newNode;
    }
    public void printlist()
    {
        Node Current=head;
        while(Current!=null)
        {
            System.out.print(Current.data+"->");
            Current=Current.next;
        }
        
    }
    public void inserAtBegging(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head = newNode;
    }
    
     public void delete(){
         Node last=head;
         Node pre=head;
         while(last.next!=null)
         {
             pre=last;
             last=last.next;
         }
         pre.next=null;
     }
}
