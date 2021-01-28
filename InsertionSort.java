package Final;

import java.io.*;

public class InsertionSort {
	public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]) throws IOException{  
    	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("enter number of elements");
    	int l=Integer.parseInt(in.readLine());
    	int arr1[] =new int[l];
    	for(int i=0;i<l;i++) {
    		arr1[i]=Integer.parseInt(in.readLine());
    	}
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); 
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}
