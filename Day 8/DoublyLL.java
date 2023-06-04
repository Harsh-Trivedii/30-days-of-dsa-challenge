import java.util.*;
public class DoublyLL
{
	Scanner s=new Scanner(System.in);
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	public Node head=null;
	public Node temp=null;
	
	void createList(int n)
	{
		int data;
		if(head==null)
		{
			System.out.println("Enter data of node 1:");
			data=s.nextInt();
			Node newnode=new Node(data);
			head=newnode;
			head.next=null;
			head.prev=null;
		}
			temp=head;
			for(int i=2;i<=n;i++)
			{
				System.out.println("Enter data of node "+i+":");
				data=s.nextInt();
				Node newnode=new Node(data);
				temp.next=newnode;
				newnode.prev=temp;
				newnode.next=null;
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
			System.out.println("\nData in the list:");
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
	}

	void insertatbeg(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			newnode.prev=null;
			head=newnode;
		}
		
	}

	void insertatend(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
			newnode.next=null;
			temp=newnode;
		}
		
	}
	
	void insertatmid(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			System.out.println("List is empty");
		}		
		else{
			temp=head;
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
					head.prev=newnode;
					head=newnode;
				}
				else{
				for(int i=2;i<=p-1;i++)
				{		
					temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next.prev=newnode;
				temp.next=newnode;
				newnode.prev=temp;
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
			head.next.prev=null;
			head=head.next;
			return temp.data;
			
		}
		return -1;
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
			return temp.data;
		}
		return -1;
	}

	int deleteatmid()
	{
		Node t=null;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
			temp=head;
			System.out.println("Enter your position:");
			int p=s.nextInt();
			if(p==1)
			{	
				head.next.prev=null;	
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
				t.next.prev=temp;
				return t.data;
			}
			
		}
		return -1;
	}


	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		DoublyLL d=new DoublyLL();
		int to_delete,data;
		char ch='y';
		do
		{
			System.out.println("\n1.create list\n2.display\n3.insertatbeg\n4.insertatend\n5.insertatmid\n6.delete at beg\n7.delete at end\n8.delete at mid\n9.Exit");
			System.out.println("Enter your choice:");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter number of nodes you want to enter:");
					int n=s.nextInt();
					d.createList(n);
					break;
				case 2:
					d.display();	
					break;
				case 3:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					d.insertatbeg(data);			
					break;
				case 4:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					d.insertatend(data);
					break;
				case 5:
					System.out.println("Enter data of new node:");
					data=s.nextInt();
					d.insertatmid(data);
					break;
				case 6:
					to_delete=d.deleteatbeg();
					if(to_delete!=-1)
					{
						System.out.println("Data deleted at beg:"+to_delete);
					}
					break;
				case 7:
					to_delete=d.deleteatend();
					if(to_delete!=-1)
					{
						System.out.println("Data deleted at end:"+to_delete);
					}
					break;
				case 8:
					to_delete=d.deleteatmid();
					if(to_delete!=-1)
					{
						System.out.println("Data deleted at mid:"+to_delete);
					}
					break;
				case 9:
					System.exit(0);					


			}
			System.out.println("Do you want to continue(y/n)");
			ch=s.next().charAt(0);
		}while(ch!='n');


	}
}
