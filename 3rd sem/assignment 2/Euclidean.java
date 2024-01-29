class Euclidean
{
	public static void main(String args[])
	{
		int p1[]={22,1,42,10};
		int p2[]={20,0,36,8};
		int sum=0;double dis;
		if(p1.length!=p2.length)
		{
			System.out.println("Invalid");
		}
		else
		{
			for(int i=0;i<p1.length;i++)
			{
				sum+=Math.pow(p1[i]-p2[i],2);
			}
			dis=Math.sqrt(sum);
			System.out.println("The Euclidean distance between them is "+dis);
		}
	}
}