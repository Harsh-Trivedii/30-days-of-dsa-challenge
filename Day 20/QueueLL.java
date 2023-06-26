//Queue using Linked list
import java.util.*;
public class QueueLL
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
	public Node front=null;
	public Node rear=null;

	void insert(int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(front==null)
		{
			front=rear=newnode;
		}
		else{
			rear.next=newnode;
			rear=newnode;
		}
	}

	int delete()
	{
		int data;
		if(front==null)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			data=front.data;
			front=front.next;
		}
		return data;
	}

	void display()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		
		}
		else{
			Node temp=front;
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data+" ");

		}
		



	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		QueueLL qa=new QueueLL();
		int choice,data;
		char con='y';
		do{
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your element:");
				data=s.nextInt();
				qa.insert(data);
				break;
			case 2:
				data=qa.delete();
				if(data==-1)
				{
					break;
				}
				System.out.println("Data deleted:"+data);
				break;
			case 3:
				qa.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("\nDo you want to continue(y/n):");
			con=s.next().charAt(0);
		}while(con=='y');		

	}
	
}
