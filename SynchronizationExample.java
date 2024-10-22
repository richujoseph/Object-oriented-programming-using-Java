package Synchronisation;
class Shared{
	synchronized public void Increment(int counter) {
		System.out.println("INCREMENTING.....");
		for(int i=0;i<5;i++) {
			counter++;
			System.out.println(counter);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println("Thread Interrupted");
			}
		}
	}
	synchronized public void Decrement(int counter) {
		System.out.println("DECREMENTING.....");
		for(int i=0;i<5;i++) {
			counter--;
			System.out.println(counter);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println("Thread Interrupted");
			}
		}
	}
}
class IncrementCounter extends Thread{
	Shared s;
	IncrementCounter(Shared s){
		this.s=s;
	}
	public void run() {
		s.Increment(10);
	}
}
class DecrementCounter extends Thread{
	Shared s;
	DecrementCounter(Shared s){
		this.s=s;
	}
	public void run() {
		s.Decrement(10);
	}
}
public class synchronizationExample{
	public static void main(String[]args) {
		Shared s=new Shared();
		IncrementCounter ic = new IncrementCounter(s);
		DecrementCounter dc= new DecrementCounter(s);
		
		ic.start();
		dc.start();
	}
}