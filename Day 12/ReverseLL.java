//Reverse of a linked list
import java.util.*;
public class ReverseLL
{
	class  Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Node head=null;
	public Node temp=null;

	void createlist(int n)
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			int data=s.nextInt();
			Node newnode=new Node(data);
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

	void reverse()
	{
		Node curr=head;
		Node prev=head;
		temp=head;
		curr=head.next;
		temp.next=null;
		while(curr.next!=null)	
		{
			temp=curr;
			curr=curr.next;
			temp.next=prev;
			prev=temp;
		}
		curr.next=temp;
		head=curr;
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of nodes you want:");
		int n=s.nextInt();
		ReverseLL l=new ReverseLL();
		l.createlist(n);
		l.display();
		System.out.println("\nReverse of the linked list is:");
		l.reverse();
		l.display();
	}
}
