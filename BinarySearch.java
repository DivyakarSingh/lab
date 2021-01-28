package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
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
		int n=a.length;
		int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                         if(a[j-1] > a[j]){  
                                //swap elements  
                                temp = a[j-1];  
                                a[j-1] = a[j];  
                                a[j] = temp;  
                        }  
                         
                }  
        }
		System.out.println("Enter number to search");
		int s=Integer.parseInt(in.readLine());
		BinarySearch b=new BinarySearch();
		binarySearch(a,0,a.length-1,s);
	}
}
