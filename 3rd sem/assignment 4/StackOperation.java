import java.util.*;
class Stack
{
	int data[];
	int top;
	public Stack(int size)
	{
		data=new int[size];
		top=-1;
	}
	public void push(int value)
	{
		if(top==data.length-1)
		{
			System.out.println("Stack overflow");
		}
		top++;
		data[top]=value;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		int value=this.data[top];
		top--;
		return value;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty!");
			return -1;
		}
		return data[top];
	}
}
public class StackOperation
{
	public static void main(String args[])
	{
		Stack stack=new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("The top element is: " + stack.peek());
		while (!stack.isEmpty())
		{
			System.out.println("The element popped is: " + stack.pop());
		}
	}
}