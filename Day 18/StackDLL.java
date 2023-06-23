// Stack implementation using doubly linked list
import java.util.*;
public class StackDLL
{
	class Node{
		Node prev;
		int data;
		Node next;
		Node(int data)
		{
			prev=null;
			this.data=data;
			next=null;
		}
	}
	public Node top=null;

	void push(int data)
	{
		Node newnode=new Node(data);
		if(top==null)
		{
			newnode.prev=null;
			newnode.next=null;	
			top=newnode;
		}
		else{
			newnode.next=top;
			top.prev=newnode;
			newnode.prev=null;
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
			top.prev=null;	
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
		StackDLL sd=new StackDLL();
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
					sd.push(data);
					break;
				case 2: 
					data=sd.pop();
					if(data==-1)
					{
						break;
					}
					System.out.println("Element popped:"+data);
					break;
				case 3:
					data=sd.peek();
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

			System.out.println("Do you want to continue(y/n):");
			con=s.next().charAt(0);
		}while(con=='y');


	}

}
