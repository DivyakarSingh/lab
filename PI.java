package Final;

public class PI {
	public int[] pi(String pat, int M, int[] lps)
	{
		int i,j;
		char x[]=pat.toCharArray();
		j=0;
		lps[0]=0;
		i=1;
		while(i<M) {
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
		
	return lps;
}
} 