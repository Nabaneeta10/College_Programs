import java.util.*;
class SimpleInterest
{
	public static void main(String args[])
	{
		float p,r,t,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p,r and t");
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		si=p*r*t/100;
		System.out.println("The simple interest is "+si);
	}
}