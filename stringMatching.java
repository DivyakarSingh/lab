package Final;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stringMatching {
	static void Shift(String pat, String txt)  
	{  
	    int M = pat.length();  
	    int N = txt.length();  
	    int i = 0;  
	  
	    while (i <= N - M)  
	    {  
	        int j;  
	        for (j = 0; j < M; j++)  
	            if (txt.charAt(i + j) != pat.charAt(j))  
	                break;  
	  
	        if (j == M)
	        {  
	            System.out.println("Pattern occured with shift "+i);  
	            i = i + M;  
	        }  
	        else if (j == 0)  
	            i = i + 1;  
	        else
	            i = i + j;
	    }  
	}  
	public static void main (String[] args)  
	{ 
	    String txt = "ABCEABCDABCEABCD";  
	    String pat = "ABCD";  
	    System.out.println("String:"+txt);
	    System.out.println("Pattern:"+pat);
	    Shift(pat, txt);  
	}
}  

