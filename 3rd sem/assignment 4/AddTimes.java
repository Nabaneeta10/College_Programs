import java.util.*;
class Time 
{
    int hours;
    int minutes;
    public Time(int hours,int minutes) 
	{
        this.hours = hours;
        this.minutes = minutes;
    }
	 public int getHours() 
	{
        return hours;
    }
	public int getMinutes() 
	{
        return minutes;
    }
	public void addTime(Time otherTime) 
	{
        int totalMinutes = this.hours * 60 + this.minutes + otherTime.getHours() * 60 + otherTime.getMinutes();
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}
class AddTimes
{
    public static void main(String[] args) 
	{
		int h1,m1,h2,m2;
		System.out.println("Enter the hours and minutes of time1:");
		Scanner sc=new Scanner(System.in);
		h1=sc.nextInt();
		m1=sc.nextInt();
		System.out.println("Enter the hours and minutes of time2:");
		h2=sc.nextInt();
		m2=sc.nextInt();
        Time t1 = new Time(h1,m1);
        Time t2 = new Time(h2,m2);
		t1.addTime(t2);
		System.out.println("Sum: "+t1.getHours()+" hours, "+t1.getMinutes()+" minutes");
    }
}