import java.util.*;
public class pal{
public static void main(String[] args){
char[] a="malayalam".toCharArray();
int len=0,flag=0;
len=a.length;
for(int i=0;i<len/2;i++)
{
if(a[i]!=a[len-i-1])
{
flag=1;
break;
}
}	
if(flag==0)
{
System.out.println("The string is palindrome");
}
else
{
System.out.println("The string is not palindrome");
}
}
}
