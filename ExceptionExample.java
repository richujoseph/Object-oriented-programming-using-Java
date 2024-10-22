package src.Exp;
import java.util.*;


public class ExceptionExample {
	public static int divide(int a, int b) throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException("Cannot divide with Zero");
		}
		return a/b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be divided: ");
		a=s.nextInt();
		System.out.println("Enter the diving number: ");
		b=s.nextInt();
		try
		{
			System.out.println(divide(a,b));
		}
		catch(Exception ae) 
		{
			System.out.println("Exception: "+ae.getMessage());
		}
		finally
		{
			System.out.println("End");
		}
	}
}
