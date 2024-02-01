import java.util.*;
class Account
{
	int accNo,balance,timePeriod;
	float interest;
	static float IntRate=7.5f;
	Account(int acc,int bal,int tp)
	{
		accNo=acc;
		balance=bal;
		timePeriod=tp;
	}
	float calculateInterest()
	{
		interest=(balance*timePeriod*IntRate)*0.01f;
		return interest;
	}
	void showAccDetails()
	{
		System.out.println(accNo+"\t"+balance+"\t"+interest);
	}
	static void changeIntRate(float newRate)
	{
		IntRate=newRate;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,acc,bal,tp;
		System.out.print("Enter size of array:");
		n=sc.nextInt();
		Account a1[]=new Account[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter account number:");
			acc=sc.nextInt();
			System.out.print("Enter balance:");
			bal=sc.nextInt();
			System.out.print("Enter time period:");
			tp=sc.nextInt();
			a1[i]=new Account(acc,bal,tp);
		}
		System.out.println("AccNo"+"\t"+"Balance"+"\t"+"Interest");
		for(i=0;i<n;i++)
		{
			a1[i].calculateInterest();
			a1[i].showAccDetails();
		}
		System.out.println("Updating interest rate");
		System.out.println("AccNo"+"\t"+"Balance"+"\t"+"Interest");
		Account.changeIntRate(10.5f);
		for(i=0;i<n;i++)
		{
			a1[i].calculateInterest();
			a1[i].showAccDetails();
		}
	}
}