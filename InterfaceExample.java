package Interfaceex;
import java.util.*;
interface pet{
	public void getName();
	public void setName(String name);
	public void play();
	
}
class Animal{
	protected int legs;
	protected Animal(int leg){
		System.out.println("The number of legs is: "+leg);
	}
	public void walk() {
		System.out.println("It walk");
	}
	public void eat() {
		System.out.println("It eats");
	}
	
}
class Spider extends Animal{
	public Spider() {
		super(8);
		System.out.println("This is a spider");	
	}
}
class Cat extends Animal implements pet{
	String name;
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	public Cat() {
		super(4);
		System.out.println("This is a cat");
	}
	public void getName() {
		System.out.println("The name of cat is: "+name);
	}
	public void setName(String newname) {
		name=newname;
	}
	public void play() {
		System.out.println("Cat plays");
	}
	public void eat() {
		System.out.println("cat eats");
	}
}
class Fish extends Animal implements pet{
	String name;
	public Fish() {
		super(0);
		System.out.println("This is Fish");
	}
	public void getName() {
		System.out.println("The name of Fish is: "+name);
	}
	public void setName(String newname) {
		name=newname;
	}
	public void play() {
		System.out.println("Fish plays");
	}
	public void walk() {
		System.out.println("Fish not Walks");
	}
	public void eat() {
		System.out.println("Fish eats");
	}
}


public class InterfaceExample {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of cat");
		String n=sc.nextLine();
		Cat c=new Cat();
		c.setName(n);
		c.getName();
		c.eat();
		c.play();
		System.out.println();
		Fish f=new Fish();
		System.out.println("Enter the name of Fish");
		String q=sc.nextLine();
		f.setName(q);
		f.getName();
		f.eat();
		f.play();
		System.out.println();
		Spider s=new Spider();
		s.eat();
		System.out.println();
	}

}
