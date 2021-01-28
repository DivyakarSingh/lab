package Final;

import java.io.*;

public class LPS {
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String a;
		int n,i,j;
		int lps[]=new int[100];
		System.out.println("Enter String:");
		a=in.readLine();
		char x[]=a.toCharArray();
		n=a.length();
		j=0;
		lps[0]=0;
		i=1;
		while(i<n) {
			if(x[i]==x[j]) {
				j++;
				lps[i]=j;
				i++;				
			}
			else
			{
				if(j!=0) {
					j=lps[j-1];
				}
				else
				{
					lps[i]=0;
					i++;
				}
			}
		}
	for(i=0;i<n;i++) {
		System.out.print(lps[i]);
	}
}
}

