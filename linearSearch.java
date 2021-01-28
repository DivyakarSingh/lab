package Final;
import java.io.*;

public class linearSearch {
	public static int LinearSearch(int toFind,int a[])
	{
		int i=0;
		while(i<a.length)
		{
			int curr=a[i];
			if(toFind==curr)
			{
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array of 5 elements");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("Enter number to search");
		int s=Integer.parseInt(in.readLine());
		int t=LinearSearch(s,a);
		if(t!=-1)
		System.out.println("found at index "+t);
		else 
			System.out.println("not found");
	}
}
