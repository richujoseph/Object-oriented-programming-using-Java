import java.util.*;
public class fre{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.println("Enter the string: ");
String s=src.nextLine( );
System.out.println("Enter the element: ");
String b=src.nextLine( );
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==b.charAt(0))
{
count++;
}
}
System.out.println("Frequency is  " +count);
}
}
