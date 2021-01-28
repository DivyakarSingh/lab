package Final;

import java.io.*;

public class KMP {
	void KMPSearch(String pat, String txt) 
    { 
		PI t=new PI();
        int M = pat.length(); 
        int N = txt.length(); 
        int lps[] = new int[M]; 
        int j = 0;
        int []pie=t.pi(pat, M, lps);
        System.out.print("PI:");
		System.out.print("[");
		for(int i=0;i<M;i++) {
			System.out.print(lps[i]+" ");
		}
		System.out.print("]");
		System.out.println();
        int i = 0;
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                System.out.println("Found pattern at Shift " + (i - j)); 
                j = lps[j - 1]; 
            } 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    }
	public static void main(String args[]) throws IOException
    { 
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String:");
		System.out.println();
		System.out.print("Enter pattern:");
		System.out.println();
		String txt=in.readLine();
		String pat=in.readLine();
		new KMP().KMPSearch(pat, txt); 
	}
}
