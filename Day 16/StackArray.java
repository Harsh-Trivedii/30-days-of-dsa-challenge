// Implementation of stack using array
import java.util.*;
public class StackArray
{
	int top=-1;
	int maxsize=10;
	int stack[]=new int[maxsize];
	void push(int data)
	{
		if(top==maxsize-1)
		{
			System.out.println("Stack overflow");
		}
		else{
			top++;
			stack[top]=data;
		}
	}
	
	int pop()
	{
		int data;
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else{
			data=stack[top];
			top--;
		}
		return data;
	}


	int peek()
	{
		int data;
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			data=stack[top];
			return data;
		}

	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		StackArray sa=new StackArray();
		char con='y';
		int choice,data;
		do{
		System.out.println("\n1.Push\n2.Pop\n3.Peep\n4.Exit");		
		System.out.println("\nEnter your choice:");
		choice=s.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter data:");
				data=s.nextInt();
				sa.push(data);
				break;
			case 2:
				data=sa.pop();
				if(data==-1)
				{
					break;
				}
				System.out.println("Item deleted:"+data);
				break;		
			case 3:
				data=sa.peek();
				if(data==-1)
				{
					break;
				}
				System.out.println("Element at the top of the stack:"+data);
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
