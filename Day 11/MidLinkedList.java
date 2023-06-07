// Middle element of a linked list
import java.util.*;
public class MidLinkedList
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

	int midElement(int n)	
	{
		int mid=n/2;
		temp=head;
		for(int i=0;i<n/2;i++)
		{
			temp=temp.next;	
		}
		return temp.data;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of nodes you want:");
		int n=s.nextInt();
		MidLinkedList l=new MidLinkedList();
		l.createlist(n);
		l.display();
		int mid=l.midElement(n);
		System.out.println("\nMiddle element of the linked list is:"+mid);
	}
}
