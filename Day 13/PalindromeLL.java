//Palindromic linked list using Stack
import java.util.Scanner;
import java.util.Stack;
public class PalindromeLL
{
	class Node{
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

	void Palindrome(int n)
	{
		int flag=0;
		Stack<Integer> st=new Stack<Integer>();
		int element;
		temp=head;
		while(temp!=null)
		{
			st.push(temp.data);
			temp=temp.next;
		}		
		temp=head;
		while(temp!=null)
		{
			element=st.pop();
			if(temp.data==element)
			{
				flag=1;
				temp=temp.next;
			}
			else{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("\nLinked list is palindrome");
		}
		else{
			System.out.println("\nLinked list is not a palindrome");
		}
		
	}


	public static void main(String args[])
	{
		PalindromeLL l=new PalindromeLL();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of nodes you want to enter:");
		int n=s.nextInt();
		l.createlist(n);
		l.display();
		l.Palindrome(n);
		
	}

}
