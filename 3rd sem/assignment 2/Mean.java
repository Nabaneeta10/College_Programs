class Mean
{
	public static void main(String args[])
	{
		int ar[]={30,36,47,50,52,52,56,60,63,70,70,110};
		int sum=0,mean,length;
		length=ar.length;
		for(int i=0;i<length;i++)
		{
			sum+=ar[i];
		}
		mean=sum/length;
		System.out.println("The mean is "+mean);
	}
}