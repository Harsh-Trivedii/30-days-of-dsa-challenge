// Linked list cycle detection problem
import java.util.*;
public class CycleLL{
	class Node
	{
		int data;
		Node next;
		public Node()
		{
			int data;
			Node next;
		}
	}
	public Node head=null;
	public Node temp=null;
	
	void createlist(int n)
	{
		Scanner s=new Scanner(System.in);
		int data;
		System.out.println("Enter data of nodes:");
		for(int i=0;i<n;i++)
		{
			data=s.nextInt();
			Node newnode=new Node();
			newnode.data=data;
			if(head==null)
			{
				newnode.next=null;
				head=newnode;
			}	
			else{
				temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newnode;
				newnode.next=null;
				temp=newnode;
			}
		}		
	}
	
	void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	void createcycle()
	{
		temp=head;
		while(temp.next!=null)
		{ 
			temp=temp.next;
		}
		temp.next=head.next.next;    // cycle created
	}

	boolean detectcycle()
	{
		Node t=new Node();
		while(head!=null)
		{
			if(head.next==null)
			{
				return false;
			}
			if(head.next==t)
			{
				return true;
			}
			Node curr=head.next;
			head.next=t;
			head=curr;
	
		}
		return false;
	}
	
	
	public static void main(String args[])
	{
		CycleLL c=new CycleLL();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of nodes you want to enter:");
		int n=s.nextInt();
		c.createlist(n);
		c.display();
		c.createcycle();
		boolean result=c.detectcycle();
		if(result==true)
		{
			System.out.println("\nCycle exist");
		}
		else{
			System.out.println("\nNo Cycle exist");
		}
		
	}

}
