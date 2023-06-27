// Stack implementation using java collection framework
import java.util.Stack;
public class StackClass
{
	public static void main(String args[])
	{
		Stack<String> fruits=new Stack<>();

		fruits.push("Mango");
		fruits.push("Grapes");
		fruits.push("Banana");	
		System.out.println("Elements pushed:"+fruits);

		fruits.pop();
		System.out.println("After pop:"+fruits);
	}
}
