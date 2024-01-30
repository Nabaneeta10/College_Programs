import java.util.*;
class Name
{
	public static void main(String args[])
	{
		System.out.println("Enter yout name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("The name is");
		for(int i=0;i<5;i++)
		{
			System.out.println(name);
		}
	}
}