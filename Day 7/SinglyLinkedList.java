// Singly linked list all operations (insert at beginning, end, mid and delete at beginning, end and mid)
import java.util.*;
public class SinglyLinkedList
{
	Scanner s=new Scanner(System.in);
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
	void createlist(int n)
	{
		if(head==null)
		{
			System.out.println("Enter data of node 1:");
			int data=s.nextInt();
			Node newnode=new Node(data);
			head=newnode;
			head.next=null;	
		}
			temp=head;
			for(int i=2;i<=n;i++)
			{
				System.out.println("Enter data of node "+i+":");
				int data=s.nextInt();
				Node newnode=new Node(data);
				newnode.next=null;
				temp.next=newnode;
				temp=newnode;							
			}
		
	}	

	void display()
	{
		if(head==null)
		{		
			System.out.println("\nList is empty");
		}				
		else{
			temp=head;
			System.out.println("Data in the list:");
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;	
			}
		}
	}


	void insertatbeg(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			head.next=null;
		}		
		else{
			newnode.next=head;
			head=newnode;
		}
	}

	void insertatend(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			head.next=null;
		}		
		else{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			newnode.next=null;
			temp.next=newnode;
			temp=newnode;
		}
	}

	void insertatmid(int data)
	{
		Node newnode=new Node(data);
		if(head==null)	
		{
			head=newnode;
			head.next=null;
		}
		else{
			System.out.println("Enter your position:");
			int p=s.nextInt();
			if(p<0)
			{
				System.out.println("Enter valid position");
			}
			else{
				if(p==1)
				{
					newnode.next=head;
					head=newnode;
				}
				else{
					temp=head;
					for(int i=2;i<=p-1;i++)
					{
						temp=temp.next;	
					}
					newnode.next=temp.next;
					temp.next=newnode;
					temp=newnode;
				}
			}
		}
	}

	int deleteatbeg()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			temp=head;
			head=head.next;
		}
		return temp.data;
	}

	int deleteatend()
	{
		Node t=null;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			temp=head;
			while(temp.next!=null)
			{
				t=temp;
				temp=temp.next;
			}
			t.next=null;
		}
		return temp.data;
	}

	int deleteatmid()
	{
		Node t=null;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			
			t=temp=head;
			System.out.println("Enter your position:");
			int p=s.nextInt();
			if(p==1)
			{
				head=head.next;
				return temp.data;
			}
			else{
				for(int i=2;i<=p-1;i++)
				{
					temp=temp.next;
				}
				t=temp.next;
				temp.next=t.next;
			}
		}	
		return t.data;	
	}
	
	
 
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);		
		SinglyL ob=new SinglyL();
		int to_delete,data;
		char choice='y';
		do
		{
			System.out.println("\n1.Create List\n2.Display\n3.Insert at beg\n4.Insert at end\n5.insert at mid\n6.delete at beg\n7.delete at end\n8.delete at mid\n9.Exit\n");
			System.out.println("Enter your choice:");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter how many nodes you want:");
					int n=s.nextInt();
					ob.createlist(n);
					break;
				case 2:
					ob.display();
					break;
				case 3:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					ob.insertatbeg(data);
					break;
				case 4:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					ob.insertatend(data);
					break;
				case 5:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					ob.insertatmid(data);
					break;
				case 6:
					to_delete=ob.deleteatbeg();
					System.out.println("Deleted element at beg:"+to_delete);
					break;
				case 7:
					to_delete=ob.deleteatend();
					System.out.println("Deleted element at end:"+to_delete);
					break;
				case 8:
					to_delete=ob.deleteatmid();
					System.out.println("Deleted element at mid:"+to_delete);
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("Enter valid choice");


			}		


			System.out.println("Do you want to continue? ");
			choice=s.next().charAt(0);
		}while(choice!='n');
			
	}
}
