package Age;
import java.util.*;

	public class AgeExceptionExample {
		public static void Age(int a) throws IllegalStateException{
			if(a<0)
			{ 
				throw new IllegalStateException("Age cannot be negative");
			}
			if(a<18)
			{
				System.out.println("The person can't do vote");
			}
			else
			{
				System.out.println("The person can do vote");
			}
		}
		public static void main(String[] args)
		{
			int a;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the age");
			a=s.nextInt();
			try {
				Age(a);
			}
			catch(IllegalStateException as) {
				System.out.println("Exception Caught: "+as.getMessage());
			}
			finally {
				System.out.println("End");
			}
			
			
		}

	}


