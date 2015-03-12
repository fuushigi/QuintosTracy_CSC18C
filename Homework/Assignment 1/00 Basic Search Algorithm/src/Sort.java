/*
 * Tracy Quintos
 * 3/11/15
 * 18C 42030
 * Assignment #2
 */

import java.util.Random;

public class Sort {

	final static int MAX = 99;
	final static int MIN = 10;
	
	static int opEq, opLog, opAdd;
	
	static int[] array;
	public Sort() {
		// TODO Auto-generated constructor stub
		
	}
	//TODO in case needed
	public static int[] unsorted(int a[]){
		
		return a;
	}
	
	//TODO markSort
	public static int[] markSort(int a[]) {
		int temp;
		int n = a.length;
		int nm1 = a.length-1;
		
		for (int cap = 0; cap < nm1; cap++) {
			for (int last = cap+1; last < n; last++) {
				if(a[cap] > a[last]){
					temp = a[cap];
					a[cap] = a[last];
					a[last] = temp;
				}
			}
		}
		return a;
	}
	//TODO markSort
	public static int[] markSortWithAnalysis(int a[]) {
		int temp;
		int n = a.length;
		int nm1 = a.length-1;
		
		opEq++;
		
		for (int cap = 0; cap < nm1; cap++) {
			opLog++;
			opAdd += 2;
			opEq++;
			for (int last = cap+1; last < n; last++) {
				opLog += 2;
				opAdd++;
				if(a[cap] > a[last]){
					temp = a[cap];
					a[cap] = a[last];
					a[last] = temp;
					
					opEq += 3;
				}
			}
		}
		return a;
	}
	
	//TODO bubbleSort
	public static int[] bubbleSort(int a[]){
		int temp;
		int nm1 = a.length-1;
		
		for (int cap = 0; cap < nm1; cap++) {
			for (int last = 0; last < nm1; last++) {
				if(a[last] > a[last+1]){
					temp = a[last];
					a[last] = a[last+1];
					a[last+1] = temp;
				}
			}
		}
		
		return a;
	}
	//TODO bubbleSort
	public static int[] bubbleSortWithAnalysis(int a[]){
		int temp;
		int nm1 = a.length-1;
		
		opEq++;
		
		for (int cap = 0; cap < nm1; cap++) {
			opLog++;
			opAdd += 2;
			opEq++;
			for (int last = 0; last < nm1; last++) {
				opLog += 2;
				opAdd++;
				if(a[last] > a[last+1]){
					temp = a[last];
					a[last] = a[last+1];
					a[last+1] = temp;
					
					opEq += 3;
				}
			}
		}
		return a;
	}
	
	public static int[] fillArray(int size){
		array = new int[size];
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (rand.nextInt(MAX - MIN + 1) + MIN);
		}
		return array;
	}

	
	public static void print(int a[], int perLine){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
			if (i%perLine == (perLine - 1)) {
				System.out.print("\n");
			}
		}
	}
	
	public static void displayLogs(){
		System.out.println("------------------------");
		System.out.println("SORT LOGS");
		System.out.println("------------------------");
		System.out.println("N = " + array.length);
		System.out.println("n Eq = " + opEq);
		System.out.println("n Add = " + opAdd);
		System.out.println("n Log = " + opLog);
		System.out.println("n Total = " + (opEq + opAdd + opLog));
	}
	
	public static int getOpEq() {
		return opEq;
	}
	public static int getOpAdd() {
		return opAdd;
	}
	public static int getOpLog() {
		return opLog;
	}
	public static int getTotal(){
		return (opEq + opAdd + opLog);
	}
}
