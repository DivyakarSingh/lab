package Final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import midSem.LPS;
import midSem.stringMatching;

public class MenuDriven {
	public static void main(String args[])throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("menu:");
        System.out.println("1.Insertion search");
        System.out.println("2.Linear search");
        System.out.println("3.Binary search");
        System.out.println("4.Merge sort");
        System.out.println("5.Quick sort");
        System.out.println("6.Counting sort");
        System.out.println("7.lcs");
        System.out.println("8.string matching");
        System.out.println("9.lps");
        System.out.println("10.KMP StringMatching algo");
        System.out.println("11.RabinKarpAlgo");
        System.out.println("12.HeapSort");
        System.out.println("13.Kruskal Algo for MST");
        System.out.println("14.Insertion in BST");
        System.out.println("enter choice:");
        int a=Integer.parseInt(in.readLine());
        if(a==1) {
        	InsertionSort t=new InsertionSort();
        	t.main(null);
        }
        if(a==2) {
        	linearSearch t=new linearSearch();
        	t.main(null);
        }
        if(a==3) {
        	BinarySearch t=new BinarySearch();
        	t.main(null);
        }
        if(a==4) {
        	MergeSort t=new MergeSort();
        	t.main(null);
        }
        if(a==5) {
        	QuickSort t=new QuickSort();
        	t.main(null);
        }
        if(a==6) {
        	CountingSort t=new CountingSort();
        	t.main(null);
        }
        if(a==7) {
        	lcs t=new lcs();
        	t.main(null);
        }
        if(a==8) {
        	stringMatching t=new stringMatching();
        	t.main(null);
        }
        if(a==9) {
        	LPS t=new LPS();
        	t.main(null);
        }
        if(a==10) {
        	KMP t=new KMP();
        	t.main(null);
        }
        if(a==11) {
        	RabinKarp t=new RabinKarp();
        	t.main(null);
        }
        if(a==12) {
        	HeapSort t=new HeapSort();
        	t.main(null);
        }
        if(a==13) {
        	int V = 4; 
	        int E = 5; 
	        SpannigTree graph = new SpannigTree(V, E);
	        graph.main(null);
        }
        if(a==14) {
        	bstInsertion t =new bstInsertion();
        	t.main(null);;
        }
	}
}
