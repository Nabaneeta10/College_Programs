import java.util.*;
class Complex
{
    double real;
    double imaginary;
	public Complex(double real, double imaginary) 
	{
        this.real = real;
        this.imaginary = imaginary;
    }
	public void add(Complex other) 
	{
        this.real += other.real;
        this.imaginary += other.imaginary;
    }
	@Override
    public String toString() 
	{
        if (imaginary >= 0) 
		{
            return (real + " + " + imaginary + "i");
        } 
		else 
		{
            return (real + " - " + Math.abs(imaginary) + "i");
        }
    }
}
class AddComplex
{
    public static void main(String[] args) 
	{
		int r1,i1,r2,i2;
		System.out.println("Enter the real and imaginary parts of\nComplex number 1:");
		Scanner sc=new Scanner(System.in);
		r1=sc.nextInt();
		i1=sc.nextInt();
		System.out.println("Complex number 2");
		r2=sc.nextInt();
		i2=sc.nextInt();
		Complex num1 = new Complex(r1,i1);
        Complex num2 = new Complex(r2,i2);
        num1.add(num2);
        System.out.println("Sum: " + num1);
    }
}