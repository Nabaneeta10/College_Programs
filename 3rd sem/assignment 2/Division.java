import java.util.*;
class Division
{
	public static void main(String args[])
	{
		int s1,s2,s3,avg,grade;
		System.out.println("Enter the marks in 3 subjects");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		avg=(s1+s2+s3)/3;
		grade=avg/10;
		switch(grade)
		{
			case 10:
			case 9:
				System.out.println("O grade");
				break;
			case 8:
				System.out.println("E grade");
				break;
			case 7:
				System.out.println("A grade");
				break;
			case 6:
				System.out.println("B grade");
				break;
			default:
				System.out.println("Failed");
		}
	}
}