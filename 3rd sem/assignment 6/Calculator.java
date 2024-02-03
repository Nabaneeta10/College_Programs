import java.util.*;
interface Calculator
{
 abstract public int add(int a, int b);
abstract public int sub(int a,int b);
abstract public int mul(int a,int b);
abstract public int div(int a,int b);
}
class DemoCalculator implements Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		 if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
	}
}
class CalculatorDriver {
    public static void main(String args[]) {
        Calculator calculator = new DemoCalculator();
        int resultAdd = calculator.add(7, 3);
        int resultSub = calculator.sub(8, 4);
        int resultMul = calculator.mul(7, 6);
        int resultDiv = calculator.div(9, 2);
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);
        System.out.println("Division: " + resultDiv);
    }
}
 