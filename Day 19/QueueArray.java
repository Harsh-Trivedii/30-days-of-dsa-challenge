// Queue using array
import java.util.*;
public class QueueArray
{
	int front=-1;
	int rear=-1;
	int max=5;
	int queue[]=new int[max];
	void insert(int data)
	{
		if(front==-1 && rear==-1)
		{
			front=rear=0;
			queue[rear]=data;
		}	
		else{
			if(rear==max-1)
			{
				System.out.println("Queue is full");
			}
			else{
				rear=rear+1;
				queue[rear]=data;
			}
		}
	}
	
	int delete()
	{
		int data;
		if(front==-1 || front>rear)
		{
			System.out.println("Queue is empty");
			return -1;		
		}
		else{
			if(front==rear)
			{
				data=queue[front];
				front=rear=-1;
			}
			else{
				data=queue[front];
				front=front+1;
			}
		}
		return data;
	}

	void display()
	{
		if(rear==-1)
		{
			System.out.println("Queue is empty");	
		}
		else{
			System.out.println("Queue elements:");
			for(int i=front;i<=rear;i++)
			{
				System.out.print(" "+queue[i]);
			}
		}
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		QueueArray qa=new QueueArray();
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
