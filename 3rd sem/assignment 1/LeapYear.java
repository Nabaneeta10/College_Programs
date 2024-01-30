import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		year=sc.nextInt();
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("The year is leap");
		}
		else
		{
			System.out.println("The year is not leap");
		}
	}
}