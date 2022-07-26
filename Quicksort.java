package exam;

import java.util.Scanner;

public class Quicksort {
public static void quicksort(int a[],int low ,int high) {
	if(low>=high) {
		return;
		
	}
	int pivot = partition(a,low,high);
	quicksort(a,low,pivot-1);
	quicksort(a,pivot+1,high);
}
public static int partition(int a[],int low,int high) {
	int pivot = a[high];
	int i =low-1;
	for(int j = low;j<high;j++) {
		if(a[j]<pivot) {
			i++;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	i++;
	int temp = a[i];
	a[i] = a[high];
	a[high] = temp;
	return i;
}
	public static void main(String[]args) {
		int []a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n = sc.nextInt();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		long start = System.nanoTime();
		quicksort(a,0,n-1);
		long end = System.nanoTime();
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("total time taken is "+(end-start)+" nano seconds");
		System.out.println();
	}
		
	
}
