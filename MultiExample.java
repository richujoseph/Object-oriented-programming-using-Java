package thread;
import java.util.*;

class thread implements Runnable
{	
public void run()
{
		
		try 
		{
			for(int i=0;i<5;i++)
			{	
				Random r=new Random();
				int n =r.nextInt(20);
			System.out.println("The number is: "+n); 
			Thread.sleep(1000);
			if((n%2)==0)
			{
				eventhread v=new eventhread();
				v.run(n);		
			}
			if((n%2)!=0)
			{
				oddthread m=new oddthread();
				m.run(n);
			}
		}
	}
	catch(InterruptedException e)
	
	{
		System.out.println("Exception occur");
	}
}
}
class eventhread extends thread
{
	public void run(int n) 
	{
		try 
	{
			int p=n*n;
			System.out.println("The squre is: "+p);
			
	}
		catch(ArithmeticException e)
		{
			System.out.println("Exception oocured");
		}	
}
}

class oddthread extends thread{
	public void run(int n) {
		try 
	{
			int p=n*n*n;
			System.out.println("The cube is: "+p);
			
	}
		catch(ArithmeticException e)
		{
			System.out.println("Exception oocured");
		}
}
	
}
public class MultiExample {
	public static void main(String[] args) {
	thread u=new thread();
	Thread t=new Thread(u);
	t.start();
	}

}
