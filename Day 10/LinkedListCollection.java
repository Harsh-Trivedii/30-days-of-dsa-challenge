// Linked list using Collection Framework
import java.util.*;
public class LinkedListCollection
{
	public static void main(String args[])
	{
		LinkedList<String> l=new LinkedList<>();
		l.add("Virat Kohli");
		l.add("MS Dhoni");
		l.add("Sachin Tendulkar");
		System.out.println(l);

		Iterator i=l.iterator();		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		l.addFirst("Rohit Sharma");
		System.out.println("Linked list after insert at beginning");
		System.out.println(l);

		l.addLast("Yuvraj Singh");
		System.out.println("\nLinked list after insert at end");
		System.out.println(l);

		l.removeFirst();
		System.out.println("\nLinked list after delete at beginning");
		System.out.println(l);

		l.removeLast();
		System.out.println("\nLinked list after delete at end");
		System.out.println(l);

	}
}
