// Stack implementation using Linked list
import java.util.Scanner;
public class StackLL
{
	class Node{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				next=null;
			}	
	}
	public Node top=null;
	public Node temp=null;

	void push(int data)
	{
		Node newnode=new Node(data);
		if(top==null)
		{
			top=newnode;
			top.next=null;
		}
		else{
			newnode.next=top;
			top=newnode;			
		}
	}

	int pop()
	{
		int data;
		if(top==null)
		{
			System.out.println("Stack is empty");
			return -1;
		}	
		else{
			data=top.data;
			top=top.next;
		}
		return data;
	}
	
	int peek()
	{
		int data;
		if(top==null)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			data=top.data;
		}
		return data;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		StackLL sl=new StackLL();
		int choice,data;
		char con='y';
		do{
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter data:");
					data=s.nextInt();
					sl.push(data);
					break;
				case 2:
					data=sl.pop();
					if(data==-1)
					{
						break;
					}
					System.out.println("Element popped out:"+data);
					break;
				case 3:
					data=sl.peek();
					if(data==-1)
					{
						break;
					}
					System.out.println("Element at the top:"+data);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter valid choice");
			}

		System.out.println("Do you want to continue:(y/n)");
		con=s.next().charAt(0);
		}while(con=='y');
	}
}
