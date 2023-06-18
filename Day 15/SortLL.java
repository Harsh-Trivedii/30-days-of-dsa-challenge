// Sort a linked list
import java.util.*;
public class SortLL
{
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
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

	void sort()
	{
		Node prev=head,curr=null;
		int t;
		while(prev!=null)
		{
			curr=prev.next;
			while(curr!=null)
			{
				if(prev.data>curr.data)
				{
					t=prev.data;
					prev.data=curr.data;
					curr.data=t;
				}
				curr=curr.next;
			}	
			prev=prev.next;		
		}
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of nodes:");
		int n=s.nextInt();
		SortLL sl=new SortLL();
		sl.createlist(n);
		sl.display();
		sl.sort();	
		System.out.println("\nSorted list:");
		sl.display();
	}
}
