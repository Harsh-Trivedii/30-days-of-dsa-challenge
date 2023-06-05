// Circular singly linked list
import java.util.Scanner;
public class CircularSLL
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
	public Node head=null;
	public Node temp=null;

	void createlist(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			newnode.next=newnode;
			head=newnode;
		}
		else{
			temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}			
			temp.next=newnode;
			newnode.next=head;
			temp=newnode;			
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
			System.out.println("Data in the list:");
			while(temp.next!=head)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}	
			System.out.print(temp.data+" ");
		
		}
	}
	
	void insertatbeg(int data)	
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			newnode.next=newnode;
			head=newnode;
		}
		else{
			temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newnode.next=head;
			temp.next=newnode;
			head=newnode;
		}
	}
	
	void insertatend(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			newnode.next=newnode;
			head=newnode;
		}	
		else{
			temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
			temp=newnode;
		}
	}
	
	int deleteatbeg()
	{
		int data;
		if(head==null)
		{
			System.out.println("List is empty");
			return -1;
		}
		else{
			temp=head;
			data=head.data;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=head.next;
			head=head.next;
		}
		return data;
	}

	int deleteatend()
	{
		int data;
		Node t=null;
		if(head==null)
		{
			System.out.println("List is empty");
			return -1;
		}
		else{
			t=temp=head;
			while(temp.next!=head)
			{
				t=temp;
				temp=temp.next;
			}
			data=temp.data;
			t.next=head;			
		}
		return data;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		CircularSLL c=new CircularSLL();
		int choice,data;
		char con='y';
		do{
			System.out.println("\n1.create list\n2.display\n3.insert at beg\n4.insert at end\n5.delete at beg\n6.delete at end\n7.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter data:");
					data=s.nextInt();
					c.createlist(data);
					break;
				case 2:
					c.display();
					break;
				case 3:	
					System.out.println("Enter data to insert at beginning:");
					data=s.nextInt();	
					c.insertatbeg(data);
					break;
				case 4:
					System.out.println("Enter data to insert at end:");
					data=s.nextInt();	
					c.insertatend(data);
					break;
				case 5:
					data=c.deleteatbeg();
					if(data==-1)
					{
						break;
					}
					System.out.println("Element deleted at beg:"+data);
					break;
				case 6:
					data=c.deleteatend();
					if(data==-1)
					{
						break;
					}
					System.out.println("Element deleted at end:"+data);
					break;
				case 7:	
					System.exit(0);
				default:
					System.out.println("Enter valid choice");
			}			
		

			System.out.println("\nDo you want to continue(y/n):");
			con=s.next().charAt(0);
		}while(con=='y');

	}
}
