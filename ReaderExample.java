package reader;
import java.io.*;
import java.util.*;

public class ReaderExample {
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
			
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the content: ");
			String d=sc.nextLine();
			FileWriter fw=new FileWriter("sample.txt");
			fw.write(d);
			fw.close();
	FileReader fr=new FileReader("sample.txt");
	FileWriter w=new FileWriter("new_sample.txt");
	int i=fr.read();
	while(i!=-1)
	{
		w.write((char)i);
		i=fr.read();
	}
	
	fr.close();
	w.flush();
	w.close();
}
}
